package net.mcreator.gardenheaven.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BloombringerRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 20);
	}
}
