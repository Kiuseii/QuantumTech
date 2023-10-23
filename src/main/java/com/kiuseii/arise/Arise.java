package com.kiuseii.arise;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kiuseii.arise.common.init.ModBlocks;
import com.kiuseii.arise.common.init.ModCreativeTabs;
import com.kiuseii.arise.common.init.ModItems;

@Mod(Arise.MODID)
public class Arise {
  public static final String MODID = "arise";
  private static final Logger LOGGER = LoggerFactory.getLogger(MODID);

  public Arise() {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    ModBlocks.register(modEventBus);
    ModItems.register(modEventBus);
    ModCreativeTabs.register(modEventBus);

    modEventBus.addListener(this::commonSetup);

    MinecraftForge.EVENT_BUS.register(this);
  }

  private void commonSetup(final FMLCommonSetupEvent event) {
    LOGGER.info("HELLO FROM COMMON SETUP");
  }
}
