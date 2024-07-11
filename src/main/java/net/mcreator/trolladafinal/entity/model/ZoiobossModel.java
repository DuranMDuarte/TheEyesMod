package net.mcreator.trolladafinal.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.trolladafinal.entity.ZoiobossEntity;

public class ZoiobossModel extends GeoModel<ZoiobossEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZoiobossEntity entity) {
		return new ResourceLocation("trolladafinal", "animations/zoioboss.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZoiobossEntity entity) {
		return new ResourceLocation("trolladafinal", "geo/zoioboss.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZoiobossEntity entity) {
		return new ResourceLocation("trolladafinal", "textures/entities/" + entity.getTexture() + ".png");
	}

}
