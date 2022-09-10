
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gardenheaven.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GardenheavenModTabs {
	public static CreativeModeTab TAB_GARDEN_HEAVEN;

	public static void load() {
		TAB_GARDEN_HEAVEN = new CreativeModeTab("tabgarden_heaven") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.WHEAT_SEEDS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
