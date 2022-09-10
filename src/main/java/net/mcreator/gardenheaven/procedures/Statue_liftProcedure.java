package net.mcreator.gardenheaven.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class Statue_liftProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos(x, y + 1, z), _level.getBlockState(new BlockPos(x, y + 1, z)).getBlock());
	}
}
