package com.kiuseii.quantumtech.common.init;

import com.kiuseii.quantumtech.QuantumTech;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, QuantumTech.MODID);

  public static final RegistryObject<Item> SOLAR_CELL = ITEMS.register("solar_cell",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SOLAR_SCREEN = ITEMS.register("solar_screen",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BASIC_CHIP = ITEMS.register("basic_chip",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BASIC_BATTERY = ITEMS.register("basic_battery",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> PHOTONIC_PANEL = ITEMS.register("photonic_panel",
      () -> new BlockItem(ModBlocks.PHOTONIC_PANEL.get(), new Item.Properties()));

}
