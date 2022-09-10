
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gardenheaven.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.gardenheaven.item.WeirdfragmentItem;
import net.mcreator.gardenheaven.item.StalkerSwordItem;
import net.mcreator.gardenheaven.item.StalkerPickaxeItem;
import net.mcreator.gardenheaven.item.StalkerBowItem;
import net.mcreator.gardenheaven.item.ObscureStaffItem;
import net.mcreator.gardenheaven.item.ObscureCrystalItem;
import net.mcreator.gardenheaven.item.Moss_armorArmorItem;
import net.mcreator.gardenheaven.item.BloombringerItem;
import net.mcreator.gardenheaven.GardenheavenMod;

public class GardenheavenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GardenheavenMod.MODID);
	public static final RegistryObject<Item> BLOOMBRINGER = REGISTRY.register("bloombringer", () -> new BloombringerItem());
	public static final RegistryObject<Item> SIMPLESTATUE = block(GardenheavenModBlocks.SIMPLESTATUE, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> STALKER_SWORD = REGISTRY.register("stalker_sword", () -> new StalkerSwordItem());
	public static final RegistryObject<Item> STALKER_BOW = REGISTRY.register("stalker_bow", () -> new StalkerBowItem());
	public static final RegistryObject<Item> STALKER_PICKAXE = REGISTRY.register("stalker_pickaxe", () -> new StalkerPickaxeItem());
	public static final RegistryObject<Item> WEIRDFRAGMENT = REGISTRY.register("weirdfragment", () -> new WeirdfragmentItem());
	public static final RegistryObject<Item> WIELDING_STATUE = block(GardenheavenModBlocks.WIELDING_STATUE, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> STATUE_WITH_EMPTYPOT = block(GardenheavenModBlocks.STATUE_WITH_EMPTYPOT,
			GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> STATUE_WITH_ALLASSIUM_POT = block(GardenheavenModBlocks.STATUE_WITH_ALLASSIUM_POT,
			GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> STATUE_WITH_ORANGE_FLOWER_POT = block(GardenheavenModBlocks.STATUE_WITH_ORANGE_FLOWER_POT,
			GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> EMPTYPOT = block(GardenheavenModBlocks.EMPTYPOT, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> ALLASSIUM_POT = block(GardenheavenModBlocks.ALLASSIUM_POT, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> ORANGE_FLOWER_POT = block(GardenheavenModBlocks.ORANGE_FLOWER_POT,
			GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> GREYFLOWERPOT = block(GardenheavenModBlocks.GREYFLOWERPOT, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> GREYFLOWER = block(GardenheavenModBlocks.GREYFLOWER, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> ORANGEFLOWER = block(GardenheavenModBlocks.ORANGEFLOWER, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> ALLASSIUM = block(GardenheavenModBlocks.ALLASSIUM, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> OBSCURE_STAFF = REGISTRY.register("obscure_staff", () -> new ObscureStaffItem());
	public static final RegistryObject<Item> OBSCURE_CRYSTAL = REGISTRY.register("obscure_crystal", () -> new ObscureCrystalItem());
	public static final RegistryObject<Item> SMALLFOUNTAIN = block(GardenheavenModBlocks.SMALLFOUNTAIN, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> SIMPLECOLLUMN = block(GardenheavenModBlocks.SIMPLECOLLUMN, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> BOTTOMCOLLUMN = block(GardenheavenModBlocks.BOTTOMCOLLUMN, null);
	public static final RegistryObject<Item> MIDCOLLUMN = block(GardenheavenModBlocks.MIDCOLLUMN, null);
	public static final RegistryObject<Item> TOPCOLLUMN = block(GardenheavenModBlocks.TOPCOLLUMN, null);
	public static final RegistryObject<Item> WYSTERIA = block(GardenheavenModBlocks.WYSTERIA, GardenheavenModTabs.TAB_GARDEN_HEAVEN);
	public static final RegistryObject<Item> HOWLINGMASK = REGISTRY.register("howlingmask_spawn_egg",
			() -> new ForgeSpawnEggItem(GardenheavenModEntities.HOWLINGMASK, -1, -1,
					new Item.Properties().tab(GardenheavenModTabs.TAB_GARDEN_HEAVEN)));
	public static final RegistryObject<Item> MOSS_ARMOR_ARMOR_HELMET = REGISTRY.register("moss_armor_armor_helmet",
			() -> new Moss_armorArmorItem.Helmet());
	public static final RegistryObject<Item> MOSS_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("moss_armor_armor_chestplate",
			() -> new Moss_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> MOSS_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("moss_armor_armor_leggings",
			() -> new Moss_armorArmorItem.Leggings());
	public static final RegistryObject<Item> MOSS_ARMOR_ARMOR_BOOTS = REGISTRY.register("moss_armor_armor_boots",
			() -> new Moss_armorArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
