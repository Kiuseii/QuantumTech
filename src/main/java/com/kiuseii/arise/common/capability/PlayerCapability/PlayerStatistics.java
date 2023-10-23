package com.kiuseii.arise.common.capability.PlayerCapability;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.IntTag;
import net.minecraft.nbt.ListTag;

public class PlayerStatistics {
  // Statistics
  private int strength = 10;
  private int endurance = 10;
  private int dexterity = 10;
  private int agility = 10;
  private int magic = 10;

  // Spells
  private int[] spellIds = new int[5];

  public PlayerStatistics() {
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getEndurance() {
    return endurance;
  }

  public void setEndurance(int endurance) {
    this.endurance = endurance;
  }

  public int getDexterity() {
    return dexterity;
  }

  public void setDexterity(int dexterity) {
    this.dexterity = dexterity;
  }

  public int getAgility() {
    return agility;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public int getMagic() {
    return magic;
  }

  public void setMagic(int magic) {
    this.magic = magic;
  }

  public int[] getSpellIds() {
    return spellIds;
  }

  public Integer getSpell(int index) {
    return spellIds[index];
  }

  public void setSpellIds(int[] spellIds) {
    this.spellIds = spellIds;
  }

  public void setSpell(int index, int spellId) {
    this.spellIds[index] = spellId;
  }

  public void copyFrom(PlayerStatistics source) {
    this.strength = source.strength;
    this.agility = source.agility;
    this.dexterity = source.dexterity;
    this.endurance = source.endurance;
    this.magic = source.magic;
  }

  public void saveNBTData(CompoundTag nbt) {
    nbt.putInt("strength", this.strength);
    nbt.putInt("agility", this.agility);
    nbt.putInt("dexterity", this.dexterity);
    nbt.putInt("endurance", this.endurance);
    nbt.putInt("magic", this.magic);

    ListTag spellIdsList = new ListTag();
    for (Integer spellId : this.spellIds) {
      spellIdsList.add(IntTag.valueOf(spellId));
    }
    nbt.put("spellIds", spellIdsList);
  }

  public void loadNBTData(CompoundTag nbt) {
    strength = nbt.getInt("strength");
    agility = nbt.getInt("agility");
    dexterity = nbt.getInt("dexterity");
    endurance = nbt.getInt("endurance");
    magic = nbt.getInt("magic");

    ListTag spellIdsList = nbt.getList("spellIds", 3);
    for (int i = 0; i < spellIdsList.size(); i++) {
      spellIds[i] = spellIdsList.getInt(i);
    }
  }
}
