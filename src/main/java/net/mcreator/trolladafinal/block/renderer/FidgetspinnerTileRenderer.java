package net.mcreator.trolladafinal.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.trolladafinal.block.model.FidgetspinnerBlockModel;
import net.mcreator.trolladafinal.block.entity.FidgetspinnerTileEntity;

public class FidgetspinnerTileRenderer extends GeoBlockRenderer<FidgetspinnerTileEntity> {
	public FidgetspinnerTileRenderer() {
		super(new FidgetspinnerBlockModel());
	}

	@Override
	public RenderType getRenderType(FidgetspinnerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
