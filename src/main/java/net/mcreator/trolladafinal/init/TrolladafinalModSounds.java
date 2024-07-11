
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trolladafinal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.trolladafinal.TrolladafinalMod;

public class TrolladafinalModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TrolladafinalMod.MODID);
	public static final RegistryObject<SoundEvent> VOUPEGAR = REGISTRY.register("voupegar", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trolladafinal", "voupegar")));
	public static final RegistryObject<SoundEvent> RISADA = REGISTRY.register("risada", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trolladafinal", "risada")));
	public static final RegistryObject<SoundEvent> SUACARA = REGISTRY.register("suacara", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trolladafinal", "suacara")));
	public static final RegistryObject<SoundEvent> NAOVOUAGUENTAR = REGISTRY.register("naovouaguentar", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trolladafinal", "naovouaguentar")));
}
