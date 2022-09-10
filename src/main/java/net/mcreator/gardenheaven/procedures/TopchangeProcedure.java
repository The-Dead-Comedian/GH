package net.mcreator.gardenheaven.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.gardenheaven.init.GardenheavenModBlocks;

import java.util.Map;

public class TopchangeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double click = 0;
		click = click + 1;
		if (click == 1) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = GardenheavenModBlocks.SIMPLECOLLUMN.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			click = 0;
		}
	}
}
