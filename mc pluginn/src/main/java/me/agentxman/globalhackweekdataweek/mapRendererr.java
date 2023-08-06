package me.agentxman.globalhackweekdataweek;

import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapPalette;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mapRendererr extends MapRenderer {


    @Override
    public void render(MapView map, MapCanvas canvas, Player player) {

        BufferedImage pngImage;


        try {
            File imageFile = new File("C:\\Users\\Saksham Tehri\\Desktop\\.vscode\\hackathons\\ghw\\data week\\resizedStepCountTrend.png");
            pngImage = ImageIO.read(imageFile);
            canvas.drawImage(0, 0, pngImage);

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
