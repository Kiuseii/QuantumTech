package com.kiuseii.arise.common.capability.PlayerCapability;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;

public class PlayerStatisticsProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
  public static Capability<PlayerStatistics> PLAYER_STATS = CapabilityManager
      .get(new CapabilityToken<PlayerStatistics>() {
      });

  private PlayerStatistics stats = null;
  private final LazyOptional<PlayerStatistics> optional = LazyOptional.of(this::createPlayerStatistics);

  private PlayerStatistics createPlayerStatistics() {
    if (this.stats == null) {
      this.stats = new PlayerStatistics();
    }

    return this.stats;
  }

  @Override
  public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
    if (cap == PLAYER_STATS) {
      return optional.cast();
    }

    return LazyOptional.empty();
  }

  @Override
  public CompoundTag serializeNBT() {
    CompoundTag nbt = new CompoundTag();

    createPlayerStatistics().saveNBTData(nbt);

    return nbt;
  }

  @Override
  public void deserializeNBT(CompoundTag nbt) {
    createPlayerStatistics().loadNBTData(nbt);
  }
}
