package me.agentxman.globalhackweekdataweek; 
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
