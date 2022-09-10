
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gardenheaven.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.gardenheaven.block.WysteriaBlock;
import net.mcreator.gardenheaven.block.WieldingStatueBlock;
import net.mcreator.gardenheaven.block.TopcollumnBlock;
import net.mcreator.gardenheaven.block.StatueWithOrangeFlowerPotBlock;
import net.mcreator.gardenheaven.block.StatueWithEmptypotBlock;
import net.mcreator.gardenheaven.block.StatueWithAllassiumPotBlock;
import net.mcreator.gardenheaven.block.SmallfountainBlock;
import net.mcreator.gardenheaven.block.SimplestatueBlock;
import net.mcreator.gardenheaven.block.SimplecollumnBlock;
import net.mcreator.gardenheaven.block.OrangeflowerBlock;
import net.mcreator.gardenheaven.block.OrangeFlowerPotBlock;
import net.mcreator.gardenheaven.block.MidcollumnBlock;
import net.mcreator.gardenheaven.block.GreyflowerpotBlock;
import net.mcreator.gardenheaven.block.GreyflowerBlock;
import net.mcreator.gardenheaven.block.EmptypotBlock;
import net.mcreator.gardenheaven.block.BottomcollumnBlock;
import net.mcreator.gardenheaven.block.AllassiumPotBlock;
import net.mcreator.gardenheaven.block.AllassiumBlock;
import net.mcreator.gardenheaven.GardenheavenMod;

public class GardenheavenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GardenheavenMod.MODID);
	public static final RegistryObject<Block> SIMPLESTATUE = REGISTRY.register("simplestatue", () -> new SimplestatueBlock());
	public static final RegistryObject<Block> WIELDING_STATUE = REGISTRY.register("wielding_statue", () -> new WieldingStatueBlock());
	public static final RegistryObject<Block> STATUE_WITH_EMPTYPOT = REGISTRY.register("statue_with_emptypot", () -> new StatueWithEmptypotBlock());
	public static final RegistryObject<Block> STATUE_WITH_ALLASSIUM_POT = REGISTRY.register("statue_with_allassium_pot",
			() -> new StatueWithAllassiumPotBlock());
	public static final RegistryObject<Block> STATUE_WITH_ORANGE_FLOWER_POT = REGISTRY.register("statue_with_orange_flower_pot",
			() -> new StatueWithOrangeFlowerPotBlock());
	public static final RegistryObject<Block> EMPTYPOT = REGISTRY.register("emptypot", () -> new EmptypotBlock());
	public static final RegistryObject<Block> ALLASSIUM_POT = REGISTRY.register("allassium_pot", () -> new AllassiumPotBlock());
	public static final RegistryObject<Block> ORANGE_FLOWER_POT = REGISTRY.register("orange_flower_pot", () -> new OrangeFlowerPotBlock());
	public static final RegistryObject<Block> GREYFLOWERPOT = REGISTRY.register("greyflowerpot", () -> new GreyflowerpotBlock());
	public static final RegistryObject<Block> GREYFLOWER = REGISTRY.register("greyflower", () -> new GreyflowerBlock());
	public static final RegistryObject<Block> ORANGEFLOWER = REGISTRY.register("orangeflower", () -> new OrangeflowerBlock());
	public static final RegistryObject<Block> ALLASSIUM = REGISTRY.register("allassium", () -> new AllassiumBlock());
	public static final RegistryObject<Block> SMALLFOUNTAIN = REGISTRY.register("smallfountain", () -> new SmallfountainBlock());
	public static final RegistryObject<Block> SIMPLECOLLUMN = REGISTRY.register("simplecollumn", () -> new SimplecollumnBlock());
	public static final RegistryObject<Block> BOTTOMCOLLUMN = REGISTRY.register("bottomcollumn", () -> new BottomcollumnBlock());
	public static final RegistryObject<Block> MIDCOLLUMN = REGISTRY.register("midcollumn", () -> new MidcollumnBlock());
	public static final RegistryObject<Block> TOPCOLLUMN = REGISTRY.register("topcollumn", () -> new TopcollumnBlock());
	public static final RegistryObject<Block> WYSTERIA = REGISTRY.register("wysteria", () -> new WysteriaBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SimplestatueBlock.registerRenderLayer();
			WieldingStatueBlock.registerRenderLayer();
			StatueWithEmptypotBlock.registerRenderLayer();
			StatueWithAllassiumPotBlock.registerRenderLayer();
			StatueWithOrangeFlowerPotBlock.registerRenderLayer();
			EmptypotBlock.registerRenderLayer();
			AllassiumPotBlock.registerRenderLayer();
			OrangeFlowerPotBlock.registerRenderLayer();
			GreyflowerpotBlock.registerRenderLayer();
			GreyflowerBlock.registerRenderLayer();
			OrangeflowerBlock.registerRenderLayer();
			AllassiumBlock.registerRenderLayer();
			SmallfountainBlock.registerRenderLayer();
			SimplecollumnBlock.registerRenderLayer();
			BottomcollumnBlock.registerRenderLayer();
			MidcollumnBlock.registerRenderLayer();
			TopcollumnBlock.registerRenderLayer();
			WysteriaBlock.registerRenderLayer();
		}
	}
}
