package com.kiuseii.arise.event;

import com.kiuseii.arise.Arise;
import com.kiuseii.arise.common.capability.PlayerCapability.PlayerStatisticsProvider;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Arise.MODID)
public class ModEvents {
  @SubscribeEvent
  public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event) {
    if (event.getObject() instanceof Player) {
      if (!event.getObject().getCapability(PlayerStatisticsProvider.PLAYER_STATS).isPresent()) {
        event.addCapability(new ResourceLocation(Arise.MODID, "properties"), new PlayerStatisticsProvider());
      }
    }
  }
}
