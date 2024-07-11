
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trolladafinal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.trolladafinal.item.Polaroid1Item;
import net.mcreator.trolladafinal.item.MarretaItem;
import net.mcreator.trolladafinal.item.FumacaItem;
import net.mcreator.trolladafinal.block.display.FidgetspinnerDisplayItem;
import net.mcreator.trolladafinal.TrolladafinalMod;

public class TrolladafinalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TrolladafinalMod.MODID);
	public static final RegistryObject<Item> MARRETA = REGISTRY.register("marreta", () -> new MarretaItem());
	public static final RegistryObject<Item> ZOIO_BOSS_SPAWN_EGG = REGISTRY.register("zoio_boss_spawn_egg", () -> new ForgeSpawnEggItem(TrolladafinalModEntities.ZOIO_BOSS, -16777114, -205, new Item.Properties()));
	public static final RegistryObject<Item> POLAROID_1 = REGISTRY.register("polaroid_1", () -> new Polaroid1Item());
	public static final RegistryObject<Item> ZOIO_STALKER_SPAWN_EGG = REGISTRY.register("zoio_stalker_spawn_egg", () -> new ForgeSpawnEggItem(TrolladafinalModEntities.ZOIO_STALKER, -16777114, -1, new Item.Properties()));
	public static final RegistryObject<Item> FIDGETSPINNER = REGISTRY.register(TrolladafinalModBlocks.FIDGETSPINNER.getId().getPath(), () -> new FidgetspinnerDisplayItem(TrolladafinalModBlocks.FIDGETSPINNER.get(), new Item.Properties()));
	public static final RegistryObject<Item> FUMACA = REGISTRY.register("fumaca", () -> new FumacaItem());
	public static final RegistryObject<Item> ALEK_ANIMATED_SPAWN_EGG = REGISTRY.register("alek_animated_spawn_egg", () -> new ForgeSpawnEggItem(TrolladafinalModEntities.ALEK_ANIMATED, -10066330, -52429, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
