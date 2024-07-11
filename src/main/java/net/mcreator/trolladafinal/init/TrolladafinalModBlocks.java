
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trolladafinal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.trolladafinal.block.FumacaPortalBlock;
import net.mcreator.trolladafinal.block.FidgetspinnerBlock;
import net.mcreator.trolladafinal.TrolladafinalMod;

public class TrolladafinalModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TrolladafinalMod.MODID);
	public static final RegistryObject<Block> FIDGETSPINNER = REGISTRY.register("fidgetspinner", () -> new FidgetspinnerBlock());
	public static final RegistryObject<Block> FUMACA_PORTAL = REGISTRY.register("fumaca_portal", () -> new FumacaPortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
