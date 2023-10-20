package com.kiuseii.quantumtech.common.init;

import com.kiuseii.quantumtech.QuantumTech;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
      .create(Registries.CREATIVE_MODE_TAB, QuantumTech.MODID);

  public static final RegistryObject<CreativeModeTab> QUANTUM_TAB = CREATIVE_MODE_TABS.register("quantum_tech_tab",
      () -> CreativeModeTab.builder()
          .withTabsBefore(CreativeModeTabs.COMBAT)
          .icon(() -> ModItems.PHOTONIC_PANEL.get().getDefaultInstance())
          .displayItems((parameters, output) -> {
            output.accept(ModItems.SOLAR_CELL.get());
            output.accept(ModItems.SOLAR_SCREEN.get());
            output.accept(ModItems.BASIC_CHIP.get());
            output.accept(ModItems.BASIC_BATTERY.get());
            output.accept(ModItems.PHOTONIC_PANEL.get());
          }).build());
}
