
package net.mcreator.gardenheaven.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.gardenheaven.init.GardenheavenModTabs;

public class ObscureStaffItem extends Item {
	public ObscureStaffItem() {
		super(new Item.Properties().tab(GardenheavenModTabs.TAB_GARDEN_HEAVEN).durability(600).rarity(Rarity.COMMON));
	}
}
