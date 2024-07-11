
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trolladafinal.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.trolladafinal.client.renderer.ZoioStalkerRenderer;
import net.mcreator.trolladafinal.client.renderer.ZoioBossRenderer;
import net.mcreator.trolladafinal.client.renderer.AlekAnimatedRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TrolladafinalModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TrolladafinalModEntities.ZOIO_BOSS.get(), ZoioBossRenderer::new);
		event.registerEntityRenderer(TrolladafinalModEntities.ZOIO_STALKER.get(), ZoioStalkerRenderer::new);
		event.registerEntityRenderer(TrolladafinalModEntities.FUMACAPROJETIL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TrolladafinalModEntities.ALEK_ANIMATED.get(), AlekAnimatedRenderer::new);
	}
}
