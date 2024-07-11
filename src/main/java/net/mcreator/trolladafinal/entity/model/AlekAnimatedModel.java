package net.mcreator.trolladafinal.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.trolladafinal.entity.AlekAnimatedEntity;

public class AlekAnimatedModel extends GeoModel<AlekAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(AlekAnimatedEntity entity) {
		return new ResourceLocation("trolladafinal", "animations/alek.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AlekAnimatedEntity entity) {
		return new ResourceLocation("trolladafinal", "geo/alek.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AlekAnimatedEntity entity) {
		return new ResourceLocation("trolladafinal", "textures/entities/" + entity.getTexture() + ".png");
	}

}
