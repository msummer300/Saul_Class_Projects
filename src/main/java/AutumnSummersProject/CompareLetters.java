package AutumnSummersProject;


import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;

/**
 * Created by Autumn on 10/27/2016.
 */
public class CompareLetters {
    private static int count;
    /*
    Compares two images and returns a double representing the percentage of similarity
     */
    public static int compare(BufferedImage letter1, BufferedImage letter2) {
        DataBuffer buffer1 = letter1.getData().getDataBuffer();
        DataBuffer buffer2 = letter2.getData().getDataBuffer();
        try {
            if (buffer1.getSize() != buffer2.getSize()) {
                return -1;
            } else {
                for (int i = 0; i < buffer1.getSize(); i++) {
                    if (buffer1.getElem(i) == buffer2.getElem(i)) {
                        count++;
                    }
                }
            }
            return count;
        } catch (Exception e) {}
        return -1;
    }

}
