package net.mcreator.trolladafinal.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.trolladafinal.init.TrolladafinalModBlockEntities;
import net.mcreator.trolladafinal.block.renderer.FidgetspinnerTileRenderer;
import net.mcreator.trolladafinal.TrolladafinalMod;

@Mod.EventBusSubscriber(modid = TrolladafinalMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(TrolladafinalModBlockEntities.FIDGETSPINNER.get(), context -> new FidgetspinnerTileRenderer());
	}
}
