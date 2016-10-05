package AutumnSummersProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Autumn on 10/4/2016.
 */
public class FileReader {
    public List<String> letters;

    public FileReader(String dataFile){
        //dataFile does not contain the images. Instead, it contains a list of file extensions representing the images
        //and the letter the image contains.

        letters = new ArrayList<String>();

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(dataFile)));

            String str;
            while((str = reader.readLine()) != null){
                letters.add(str);
            }
        }
        catch (Exception e){}
    }
}
