package net.mcreator.trolladafinal.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.trolladafinal.block.model.FidgetspinnerDisplayModel;
import net.mcreator.trolladafinal.block.display.FidgetspinnerDisplayItem;

public class FidgetspinnerDisplayItemRenderer extends GeoItemRenderer<FidgetspinnerDisplayItem> {
	public FidgetspinnerDisplayItemRenderer() {
		super(new FidgetspinnerDisplayModel());
	}

	@Override
	public RenderType getRenderType(FidgetspinnerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
