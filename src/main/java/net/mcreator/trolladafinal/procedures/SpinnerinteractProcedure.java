package net.mcreator.trolladafinal.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.trolladafinal.init.TrolladafinalModEntities;
import net.mcreator.trolladafinal.TrolladafinalMod;

public class SpinnerinteractProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			int _value = 1;
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
		TrolladafinalMod.queueServerWork(120, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.LIGHTNING_BOLT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(5);
					entityToSpawn.setYBodyRot(5);
					entityToSpawn.setYHeadRot(5);
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = TrolladafinalModEntities.ZOIO_BOSS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trolladafinal:voupegar")), SoundSource.HOSTILE, 3, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trolladafinal:voupegar")), SoundSource.HOSTILE, 3, 1, false);
				}
			}
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		});
	}
}
