package com.kiuseii.arise.common.init;

import com.kiuseii.arise.Arise;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
      .create(Registries.CREATIVE_MODE_TAB, Arise.MODID);

  public static final RegistryObject<CreativeModeTab> QUANTUM_TAB = CREATIVE_MODE_TABS.register("quantum_tech_tab",
      () -> CreativeModeTab.builder()
          .icon(() -> ModItems.STEEL_INGOT.get().getDefaultInstance())
          .title(Component.translatable("creativetab.arise"))
          .displayItems((parameters, output) -> {
            output.accept(ModItems.STEEL_INGOT.get());
          }).build());

  public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
  }
}
