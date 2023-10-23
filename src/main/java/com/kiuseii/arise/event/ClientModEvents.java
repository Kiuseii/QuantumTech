package com.kiuseii.arise.event;

import com.kiuseii.arise.Arise;
import com.kiuseii.arise.client.KeyBindings;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Arise.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientModEvents {
  @SubscribeEvent
  public static void onKeyRegister(RegisterKeyMappingsEvent event) {
    event.register(KeyBindings.SKILL_BAR_KEY);
  }
}
