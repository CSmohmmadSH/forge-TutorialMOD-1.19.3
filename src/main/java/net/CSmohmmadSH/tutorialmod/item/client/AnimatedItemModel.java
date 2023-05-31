package net.CSmohmmadSH.tutorialmod.item.client;

import net.CSmohmmadSH.tutorialmod.TutorialMod;
import net.CSmohmmadSH.tutorialmod.item.custom.AnimatedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedItemModel extends GeoModel<AnimatedItem> {
    @Override
    public ResourceLocation getModelResource(AnimatedItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/animated_item.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AnimatedItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/item/animated_item.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AnimatedItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/animated_item.animation.json");
    }
}