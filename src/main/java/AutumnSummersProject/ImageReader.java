package AutumnSummersProject;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;

/**
 * Created by Autumn on 10/4/2016.
 */
public class ImageReader {
    public String image;

    //interprets an image based on the string representation of it's location
    public ImageReader(String location) {
        try {
            Imgproc process = new Imgproc();
            DataBuffer buffer;
            String current;
            image = "";
            String loc = "data/AutumnSummersData/" + location;
            File inputFile = new File(loc);
            buffer = ImageIO.read(inputFile).getData().getDataBuffer();
            for(int i=0; i < (buffer.getSize() - 1); i++){
                current = String.valueOf(buffer.getElem(i));
                //System.out.println(current);
                if(current.equals("0")){
                    image = image.concat("000");
                }
                else{
                    image = image.concat(current);
                }
                image = image.concat(" ");
            }
            //System.out.println(image);
            //System.out.println("Processed image!");
        }
        catch (Exception e){}
    }

}

