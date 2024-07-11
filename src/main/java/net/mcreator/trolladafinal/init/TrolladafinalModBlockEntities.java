
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trolladafinal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.trolladafinal.block.entity.FidgetspinnerTileEntity;
import net.mcreator.trolladafinal.TrolladafinalMod;

public class TrolladafinalModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TrolladafinalMod.MODID);
	public static final RegistryObject<BlockEntityType<FidgetspinnerTileEntity>> FIDGETSPINNER = REGISTRY.register("fidgetspinner",
			() -> BlockEntityType.Builder.of(FidgetspinnerTileEntity::new, TrolladafinalModBlocks.FIDGETSPINNER.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
