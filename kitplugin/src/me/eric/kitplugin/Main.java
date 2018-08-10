package me.eric.kitplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("Kit plugin has been enabled.");
    }
    @Override
    public void onDisable(){
        getLogger().info("Kit plugin has been disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            if(command.getName().equalsIgnoreCase("food")){
                Player p = (Player) sender;
                ItemStack item = new ItemStack(Material.COOKED_PORKCHOP, 64);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(ChatColor.YELLOW+"Shadoshi豬排");
                item.setItemMeta(meta);
                p.getInventory().addItem(item);
                p.sendMessage(ChatColor.RED+"[快遞] Shadoshi豬排已送到你背包，請慢用!");
                return true;
            }
        }
        return false;
    }
}
