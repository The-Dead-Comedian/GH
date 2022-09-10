
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gardenheaven.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.gardenheaven.client.model.Modelhowling_mask;
import net.mcreator.gardenheaven.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GardenheavenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelhowling_mask.LAYER_LOCATION, Modelhowling_mask::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
