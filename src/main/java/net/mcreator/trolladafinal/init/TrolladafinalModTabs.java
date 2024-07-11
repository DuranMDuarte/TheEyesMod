
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trolladafinal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.trolladafinal.TrolladafinalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TrolladafinalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrolladafinalMod.MODID);
	public static final RegistryObject<CreativeModeTab> EYES_TAB = REGISTRY.register("eyes_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.trolladafinal.eyes_tab")).icon(() -> new ItemStack(TrolladafinalModItems.MARRETA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TrolladafinalModItems.MARRETA.get());
				tabData.accept(TrolladafinalModItems.ZOIO_BOSS_SPAWN_EGG.get());
				tabData.accept(TrolladafinalModItems.POLAROID_1.get());
				tabData.accept(TrolladafinalModItems.ZOIO_STALKER_SPAWN_EGG.get());
				tabData.accept(TrolladafinalModItems.ZOIO_FINAL_SPAWN_EGG.get());
				tabData.accept(TrolladafinalModBlocks.FIDGETSPINNER.get().asItem());
				tabData.accept(TrolladafinalModItems.FUMACA.get());
				tabData.accept(TrolladafinalModItems.ALEK_SPAWN_EGG.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TrolladafinalModItems.ALEK_ANIMATED_SPAWN_EGG.get());
		}
	}
}
