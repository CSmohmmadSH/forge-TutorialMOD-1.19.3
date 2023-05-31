package net.CSmohmmadSH.tutorialmod.item.client;

import net.CSmohmmadSH.tutorialmod.item.custom.AnimatedItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AnimatedItemRenderer extends GeoItemRenderer<AnimatedItem> {
    public AnimatedItemRenderer() {
        super(new AnimatedItemModel());
    }
}