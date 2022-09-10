
package net.mcreator.gardenheaven.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class StalkerSwordItem extends Item {
	public StalkerSwordItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(2031).rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 10;
	}
}
