
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trolladafinal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.trolladafinal.entity.ZoiobossEntity;
import net.mcreator.trolladafinal.entity.ZoioStalkerEntity;
import net.mcreator.trolladafinal.entity.FumacaprojetilEntity;
import net.mcreator.trolladafinal.entity.AlekAnimatedEntity;
import net.mcreator.trolladafinal.TrolladafinalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TrolladafinalModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TrolladafinalMod.MODID);
	public static final RegistryObject<EntityType<ZoioStalkerEntity>> ZOIO_STALKER = register("zoio_stalker", EntityType.Builder.<ZoioStalkerEntity>of(ZoioStalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZoioStalkerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FumacaprojetilEntity>> FUMACAPROJETIL = register("fumacaprojetil",
			EntityType.Builder.<FumacaprojetilEntity>of(FumacaprojetilEntity::new, MobCategory.MISC).setCustomClientFactory(FumacaprojetilEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AlekAnimatedEntity>> ALEK_ANIMATED = register("alek_animated",
			EntityType.Builder.<AlekAnimatedEntity>of(AlekAnimatedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlekAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZoiobossEntity>> ZOIOBOSS = register("zoioboss",
			EntityType.Builder.<ZoiobossEntity>of(ZoiobossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZoiobossEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZoioStalkerEntity.init();
			AlekAnimatedEntity.init();
			ZoiobossEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZOIO_STALKER.get(), ZoioStalkerEntity.createAttributes().build());
		event.put(ALEK_ANIMATED.get(), AlekAnimatedEntity.createAttributes().build());
		event.put(ZOIOBOSS.get(), ZoiobossEntity.createAttributes().build());
	}
}
