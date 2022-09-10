
package net.mcreator.gardenheaven.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.gardenheaven.init.GardenheavenModTabs;

public class BloombringerItem extends Item {
	public BloombringerItem() {
		super(new Item.Properties().tab(GardenheavenModTabs.TAB_GARDEN_HEAVEN).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 16;
	}
}
