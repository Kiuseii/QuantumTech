package com.kiuseii.quantumtech.common.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class PhotonicPanelBlockEntity extends BlockEntity {

  private int energyStored = 0;

  public PhotonicPanelBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState) {
    super(pType, pPos, pBlockState);
  }

  public int getEnergyStored() {
    return energyStored;
  }
}
