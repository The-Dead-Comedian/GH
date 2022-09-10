
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gardenheaven.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.gardenheaven.entity.StalkerBowEntity;
import net.mcreator.gardenheaven.entity.HowlingmaskEntity;
import net.mcreator.gardenheaven.GardenheavenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GardenheavenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, GardenheavenMod.MODID);
	public static final RegistryObject<EntityType<StalkerBowEntity>> STALKER_BOW = register("projectile_stalker_bow",
			EntityType.Builder.<StalkerBowEntity>of(StalkerBowEntity::new, MobCategory.MISC).setCustomClientFactory(StalkerBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HowlingmaskEntity>> HOWLINGMASK = register("howlingmask",
			EntityType.Builder.<HowlingmaskEntity>of(HowlingmaskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HowlingmaskEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HowlingmaskEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HOWLINGMASK.get(), HowlingmaskEntity.createAttributes().build());
	}
}
