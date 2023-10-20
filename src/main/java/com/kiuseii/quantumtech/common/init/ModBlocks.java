package com.kiuseii.quantumtech.common.init;

import com.kiuseii.quantumtech.QuantumTech;
import com.kiuseii.quantumtech.common.block.PhotonicPanelBlock;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
      QuantumTech.MODID);

  public static final RegistryObject<Block> PHOTONIC_PANEL = BLOCKS.register("photonic_panel", PhotonicPanelBlock::new);
}
