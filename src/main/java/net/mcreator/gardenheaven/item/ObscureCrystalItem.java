
package net.mcreator.gardenheaven.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.gardenheaven.init.GardenheavenModTabs;

public class ObscureCrystalItem extends Item {
	public ObscureCrystalItem() {
		super(new Item.Properties().tab(GardenheavenModTabs.TAB_GARDEN_HEAVEN).stacksTo(64).rarity(Rarity.COMMON));
	}
}
