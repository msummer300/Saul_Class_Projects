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
    public static int compare(String letter1, String letter2) {
        //DataBuffer buffer1 = letter1.getData().getDataBuffer();
        //DataBuffer buffer2 = letter2.getData().getDataBuffer();
        try {
            if (letter1.length() != letter2.length()) {
                return -1;
            } else {
                for (int i = 0; i < letter1.length(); i++) {
                    if (letter1.charAt(i) == letter2.charAt(i)) {
                        count++;
                    }
                }
            }
            return count;
        } catch (Exception e) {}
        return -1;
    }

}
