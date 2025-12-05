package net.seamonstermus.revampedshulkerboxes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.seamonstermus.revampedshulkerboxes.RevampedShulkerboxes;
import net.seamonstermus.revampedshulkerboxes.block.ModBlocks;

public class modItemGroups {
    public static final ItemGroup SHULKER_BOX_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RevampedShulkerboxes.MOD_ID, "gold_shulker_box"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gold_shulker_box"))
                    .icon(() -> new ItemStack(modItems.GOLD_SHULKER_BOX)).entries((displayContext, entries) -> {
                        entries.add(modItems.GOLD_SHULKER_BOX);
                        entries.add(ModBlocks.GOLD_SHULKER_BOX_BLOCK);
                    }).build());


    public static void registerItemGroups(){
        RevampedShulkerboxes.LOGGER.info("Registering Item Groups for " +RevampedShulkerboxes.MOD_ID);
    }
}
