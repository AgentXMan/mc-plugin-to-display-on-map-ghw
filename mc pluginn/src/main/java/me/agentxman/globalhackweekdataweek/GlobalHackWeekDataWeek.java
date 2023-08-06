package me.agentxman.globalhackweekdataweek;
//
//import org.bukkit.plugin.java.JavaPlugin;
//
//public final class GlobalHackWeekDataWeek extends JavaPlugin {
//
//    @Override
//    public void onEnable() {
//        // Plugin startup logic
//        System.out.println("Works!");
//    }
//
//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic
//    }
//}
//


//import org.bukkit.Location;
//import org.bukkit.Material;
//import org.bukkit.World;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//import org.bukkit.plugin.java.JavaPlugin;
//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
//public class GlobalHackWeekDataWeek extends JavaPlugin {
//
//    public BufferedImage pngImage;
//
//    @Override
//    public void onEnable() {
//        // Load the PNG image on plugin enable
//        System.out.println("Started");
//        try {
//            File imageFile = new File("C:\\Users\\Saksham Tehri\\Desktop\\.vscode\\hackathons\\ghw\\data week\\stepCountTrend.png");
//            pngImage = ImageIO.read(imageFile);
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println(e);
//        }
//
//        getCommand("buildpng").setExecutor(this);
//    }
//
//
//    @Override
//    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
//        if (cmd.getName().equalsIgnoreCase("buildpng")) {
//            if (pngImage != null) {
//                World world = sender.getServer().getWorld("world"); // Replace "world" with your desired world name
//                Location startLocation = ((Player) sender).getLocation(); // Get the player's current location
//                buildPNGImage(world, startLocation, pngImage);
//                sender.sendMessage("PNG image built in the Minecraft world!");
//            } else {
//                sender.sendMessage("Failed to load the PNG image.");
//            }
//            return true;
//        }
//        return false;
//    }
//
//    public void buildPNGImage(World world, Location startLocation, BufferedImage image) {
//        int width = image.getWidth();
//        int height = image.getHeight();
//
//        int startX = startLocation.getBlockX();
//        int startY = startLocation.getBlockY();
//        int startZ = startLocation.getBlockZ();
//
//        for (int x = 0; x < width; x++) {
//            for (int z = 0; z < height; z++) {
//                Color pixelColor = new Color(image.getRGB(x, z));
//                Material blockType = getBlockTypeFromColor(pixelColor); // Implement the color-to-block mapping
//                world.getBlockAt(startX + x, startY, startZ + z).setType(blockType);
//            }
//        }
//    }
//
//    // Implement this method to map colors to Minecraft block types
//    public Material getBlockTypeFromColor(Color color) {
//        // You need to define the mapping here based on the RGB values of the color
//        // For simplicity, let's assume we're using wool blocks with different colors
//        if (color.equals(Color.RED)) {
//            return Material.RED_WOOL;
//        }
//        else if (color.equals(Color.BLUE)) {
//            return Material.BLUE_WOOL;
//        }
//        else if (color.equals(Color.GREEN)) {
//            return Material.GREEN_WOOL;
//        }
//        else {
//            return Material.WHITE_WOOL;
//        }
//    }
//}


import me.agentxman.globalhackweekdataweek.commandss.map;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;
import org.bukkit.plugin.java.JavaPlugin;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GlobalHackWeekDataWeek extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("started");
        getCommand("map").setExecutor(new map());
        System.out.println("registered");
    }



}

//    private BufferedImage pngImage;
//
//    @Override
//    public void onEnable() {
//        // Load the PNG image on plugin enable
//        System.out.println("started");
//        try {
//            System.out.println("Entered here");
//            File imageFile = new File("C:\\Users\\Saksham Tehri\\Desktop\\.vscode\\hackathons\\ghw\\data week\\stepCountTrend.png");
//            pngImage = ImageIO.read(imageFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("error");
//        }
//
//        // Register the custom map renderer
//        Bukkit.getServer().getMapIterator().forEachRemaining(this::addMapRenderer);
//    }
//
//
//    private void addMapRenderer(MapView mapView) {
//        mapView.addRenderer(new CustomMapRenderer());
//    }
//
//    @Override
//    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
//        if (cmd.getName().equalsIgnoreCase("viewpng")) {
//            if (pngImage != null && sender instanceof Player) {
//                Player player = (Player) sender;
//                giveCustomMapItem(player, pngImage);
//                sender.sendMessage("PNG image displayed on the map item!");
//            } else {
//                sender.sendMessage("Failed to load the PNG image or invalid sender.");
//            }
//            return true;
//        }
//        return false;
//    }
//
//    private void giveCustomMapItem(Player player, BufferedImage image) {
//        // Create a custom map item with the PNG image as the content
//        MapView mapView = Bukkit.createMap(player.getWorld());
//        mapView.setScale(MapView.Scale.FARTHEST);
//        mapView.getRenderers().forEach(mapView::removeRenderer); // Remove existing renderers
//        mapView.addRenderer(new CustomMapRenderer(image));
//
//        // Give the map item to the player
//        player.getInventory().addItem(mapView.getMapItem());
//    }
//
//    public static class CustomMapRenderer extends MapRenderer {
//        private BufferedImage pngImage;
//
//        public CustomMapRenderer(BufferedImage image) {
//            this.pngImage = image;
//        }
//
//        @Override
//        public void render(MapView mapView, MapCanvas mapCanvas, Player player) {
//            if (pngImage != null) {
//                mapCanvas.drawImage(0, 0, pngImage);
//            }
//        }
//    }
//}
