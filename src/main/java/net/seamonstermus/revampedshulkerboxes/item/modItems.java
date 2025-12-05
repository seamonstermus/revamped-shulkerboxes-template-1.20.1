package net.seamonstermus.revampedshulkerboxes.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.seamonstermus.revampedshulkerboxes.RevampedShulkerboxes;

public class modItems {
    public static final Item GOLD_SHULKER_BOX = registerItem("gold_shulker_box", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(GOLD_SHULKER_BOX);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RevampedShulkerboxes.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RevampedShulkerboxes.LOGGER.info("Registering Mod Items for " + RevampedShulkerboxes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(modItems::addItemsToIngredientItemGroup);
    }
}
