package me.agentxman.globalhackweekdataweek.commandss;

import me.agentxman.globalhackweekdataweek.mapRendererr;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

public class map implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            ItemStack mapItem = new ItemStack(Material.FILLED_MAP, 1);

            MapMeta mapMeta = (MapMeta) mapItem.getItemMeta();

            MapView mapview = Bukkit.createMap(player.getWorld());


            MapRenderer maprender = new mapRendererr();
            mapview.getRenderers().clear();
            mapview.addRenderer(maprender);

            mapMeta.setMapView(mapview);
            mapItem.setItemMeta(mapMeta);

            player.getInventory().addItem(mapItem);
            System.out.println("gave map");
            player.sendMessage("gave map");

        }
        else {
            System.out.println("doesnt work");
        }
        return true;
    }

}
