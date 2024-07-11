package net.mcreator.trolladafinal.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.trolladafinal.entity.ZoioFinalEntity;

public class ZoioFinalModel extends GeoModel<ZoioFinalEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZoioFinalEntity entity) {
		return new ResourceLocation("trolladafinal", "animations/finalzoio.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZoioFinalEntity entity) {
		return new ResourceLocation("trolladafinal", "geo/finalzoio.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZoioFinalEntity entity) {
		return new ResourceLocation("trolladafinal", "textures/entities/" + entity.getTexture() + ".png");
	}

}
