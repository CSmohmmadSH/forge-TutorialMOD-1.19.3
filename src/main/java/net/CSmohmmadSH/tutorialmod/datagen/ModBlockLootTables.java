package net.CSmohmmadSH.tutorialmod.datagen;

import net.CSmohmmadSH.tutorialmod.block.ModBlocks;
import net.CSmohmmadSH.tutorialmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BLACK_OPAL_BLOCK.get());

        dropSelf(ModBlocks.RUBY_BLOCK.get());

        add(ModBlocks.BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));
        add(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));
        add(ModBlocks.NETHERRACK_BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERRACK_BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));
        add(ModBlocks.ENDSTONE_BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));

        add(ModBlocks.RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.NETHERRACK_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERRACK_RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.ENDSTONE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_RUBY_ORE.get(), ModItems.RUBY.get()));



        this.dropSelf(ModBlocks.EBONY_LOG.get());
        this.dropSelf(ModBlocks.EBONY_WOOD.get());
        this.dropSelf(ModBlocks.EBONY_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_LOG.get());
        this.dropSelf(ModBlocks.EBONY_SAPLING.get());

        this.dropSelf(ModBlocks.PINK_OAK_LOG.get());
        this.dropSelf(ModBlocks.PINK_OAK_WOOD.get());
        this.dropSelf(ModBlocks.PINK_OAK_PLANKS.get());
        this.dropSelf(ModBlocks.PINK_OAK_SAPLING.get());

        this.add(ModBlocks.EBONY_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.EBONY_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.PINK_OAK_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.PINK_OAK_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
