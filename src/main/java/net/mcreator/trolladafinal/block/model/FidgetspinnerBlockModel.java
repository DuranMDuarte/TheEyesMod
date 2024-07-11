package net.mcreator.trolladafinal.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.trolladafinal.block.entity.FidgetspinnerTileEntity;

public class FidgetspinnerBlockModel extends GeoModel<FidgetspinnerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FidgetspinnerTileEntity animatable) {
		return new ResourceLocation("trolladafinal", "animations/spinner_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FidgetspinnerTileEntity animatable) {
		return new ResourceLocation("trolladafinal", "geo/spinner_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FidgetspinnerTileEntity animatable) {
		return new ResourceLocation("trolladafinal", "textures/block/spinneranimated.png");
	}
}
