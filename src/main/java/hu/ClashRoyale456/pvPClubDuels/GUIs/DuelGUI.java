package hu.ClashRoyale456.pvPClubDuels.GUIs;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;

public class DuelGUI {

    public static Inventory create() {
        Inventory inv = Bukkit.createInventory(null, 27, Component.text("Duel Modes"));

        inv.setItem(10, createItem(Material.IRON_SWORD, "Sword"));
        inv.setItem(12, createItem(Material.IRON_AXE, "Axe"));
        inv.setItem(14, createItem(Material.POTION, "Pot"));
        inv.setItem(16, createItem(Material.SPLASH_POTION, "NethPot"));
        inv.setItem(22, createItem(Material.DIAMOND, "SMP"));

        return inv;
    }

    private static ItemStack createItem(Material mat, String name) {
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(name));
        item.setItemMeta(meta);
        return item;
    }
}
