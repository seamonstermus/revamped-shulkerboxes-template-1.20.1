package net.seamonstermus.revampedshulkerboxes.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.seamonstermus.revampedshulkerboxes.RevampedShulkerboxes;

public class Modblocks {
    public static final Block Gold_Shulker_Box = new GoldShulkerBoxBlock(DyeColor.PURPLE, null);
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RevampedShulkerboxes.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RevampedShulkerboxes.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        RevampedShulkerboxes.LOGGER.info("Registering ModBlocks for " + RevampedShulkerboxes.MOD_ID);

    }
}
