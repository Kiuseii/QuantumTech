package com.kiuseii.quantumtech;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = QuantumTech.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {

        private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

        // Ici, vous pouvez ajouter vos propres paramètres de configuration selon vos
        // besoins.
        // Pour le moment, je vais laisser cette section vide puisque les exemples ont
        // été supprimés.

        static final ForgeConfigSpec SPEC = BUILDER.build();

        @SubscribeEvent
        static void onLoad(final ModConfigEvent event) {
                // Mettez à jour les valeurs de vos paramètres de configuration ici lors du
                // chargement de la configuration.
                // Cela sera nécessaire lorsque vous ajouterez vos propres paramètres.
        }
}
