package net.mcreator.trolladafinal.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.trolladafinal.block.display.FidgetspinnerDisplayItem;

public class FidgetspinnerDisplayModel extends GeoModel<FidgetspinnerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FidgetspinnerDisplayItem animatable) {
		return new ResourceLocation("trolladafinal", "animations/spinner_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FidgetspinnerDisplayItem animatable) {
		return new ResourceLocation("trolladafinal", "geo/spinner_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FidgetspinnerDisplayItem entity) {
		return new ResourceLocation("trolladafinal", "textures/block/spinneranimated.png");
	}
}
