package com.kiuseii.arise.event;

import com.kiuseii.arise.Arise;
import com.kiuseii.arise.client.KeyBindings;
import com.kiuseii.arise.common.capability.PlayerCapability.PlayerStatistics;
import com.kiuseii.arise.common.capability.PlayerCapability.PlayerStatisticsProvider;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Arise.MODID, value = Dist.CLIENT)
public class ClientForgeEvents {
  @SubscribeEvent
  public static void onKeyInput(InputEvent.Key event) {
    if (KeyBindings.SKILL_BAR_KEY.consumeClick()) {
      LocalPlayer player = Minecraft.getInstance().player;
      LazyOptional<PlayerStatistics> stats = player
          .getCapability(PlayerStatisticsProvider.PLAYER_STATS);

      stats.ifPresent(cap -> {
        player.sendSystemMessage(Component.literal("Strength : " + cap.getStrength()));
        player.sendSystemMessage(Component.literal("Dexterity : " + cap.getDexterity()));
        player.sendSystemMessage(Component.literal("Endurance : " + cap.getEndurance()));
        player.sendSystemMessage(Component.literal("Magic : " + cap.getMagic()));
        player.sendSystemMessage(Component.literal("Agilty : " + cap.getAgility()));
      });
    }
  }
}
