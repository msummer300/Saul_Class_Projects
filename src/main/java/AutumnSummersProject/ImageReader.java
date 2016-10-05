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
            File inputFile = new File(location);
            image = ImageIO.read(inputFile);
        }
        catch (Exception e){}
    }

}

