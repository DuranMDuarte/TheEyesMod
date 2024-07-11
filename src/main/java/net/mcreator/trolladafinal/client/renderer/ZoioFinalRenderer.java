
package net.mcreator.trolladafinal.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.trolladafinal.entity.model.ZoioFinalModel;
import net.mcreator.trolladafinal.entity.layer.ZoioFinalLayer;
import net.mcreator.trolladafinal.entity.ZoioFinalEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ZoioFinalRenderer extends GeoEntityRenderer<ZoioFinalEntity> {
	public ZoioFinalRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ZoioFinalModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new ZoioFinalLayer(this));
	}

	@Override
	public RenderType getRenderType(ZoioFinalEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ZoioFinalEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(ZoioFinalEntity entityLivingBaseIn) {
		return 0.0F;
	}
}