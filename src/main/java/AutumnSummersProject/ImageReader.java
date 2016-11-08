package AutumnSummersProject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by Autumn on 10/4/2016.
 */
public class ImageReader {
    public BufferedImage image;

    //interprets an image based on the string representation of it's location
    public ImageReader(String location) {
        try {
            //System.out.print(location);
            //location = location.substring(5);
            String loc = "data/AutumnSummersData/" + location;
            //System.out.print(loc);
            File inputFile = new File(loc);
            image = ImageIO.read(inputFile)
            //image = ImageIO.read(inputFile).getData().getDataBuffer().getOffset();
        }
        catch (Exception e){}
    }

}

