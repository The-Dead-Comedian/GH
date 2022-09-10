
package net.mcreator.gardenheaven.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gardenheaven.entity.HowlingmaskEntity;
import net.mcreator.gardenheaven.client.model.Modelhowling_mask;

public class HowlingmaskRenderer extends MobRenderer<HowlingmaskEntity, Modelhowling_mask<HowlingmaskEntity>> {
	public HowlingmaskRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhowling_mask(context.bakeLayer(Modelhowling_mask.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HowlingmaskEntity entity) {
		return new ResourceLocation("gardenheaven:textures/entities/howling_mask.png");
	}
}
