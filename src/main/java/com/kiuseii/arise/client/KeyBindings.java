package com.kiuseii.arise.client;

import org.lwjgl.glfw.GLFW;

import com.mojang.blaze3d.platform.InputConstants;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;

public class KeyBindings {
  public static final String KEY_CATEGORY_ARISE = "key.category.arise";
  public static final String KEY_SKILL_BAR = "key.arise.skill_bar";

  public static final KeyMapping SKILL_BAR_KEY = new KeyMapping(KEY_SKILL_BAR, KeyConflictContext.IN_GAME,
      InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_R, KEY_CATEGORY_ARISE);

}
