package net.seamonstermus.revampedshulkerboxes.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.seamonstermus.revampedshulkerboxes.RevampedShulkerboxes;

public class modItems {
    public static final Item Gold_Shulker_Box = registerItem("gold_shulker_box", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTab(FabricItemGroupEntries entries) {
        entries.add(Gold_Shulker_Box);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RevampedShulkerboxes.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RevampedShulkerboxes.LOGGER.info("Registering Mod Items for " + RevampedShulkerboxes.MOD_ID);
    }
}
