package AutumnSummersProject;

import edu.illinois.cs.cogcomp.lbjava.classify.FeatureVector;
import edu.illinois.cs.cogcomp.lbjava.classify.ScoreSet;
import edu.illinois.cs.cogcomp.lbjava.learn.Learner;

import java.awt.image.BufferedImage;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by Autumn on 10/27/2016.
 */


public class CharRecognitionKNN{
    private int maxLength = 3;
    public String value;

    public CharRecognitionKNN(String letter, FileReader train){
        BufferedImage img = new ImageReader(letter).image;

        value = classifyLetter(img, train);
    }

    private ArrayList<Neighbor> findNearestNeighbors(BufferedImage letter, FileReader train){
        ArrayList<Neighbor> NearestNeighbors = new ArrayList<>();
        int i;
        int percentage;
        for(i=0; i < train.letters.size(); i++){
            String [] location = train.letters.get(i).split(" ");
            ImageReader processImage = new ImageReader(location[1]);
            BufferedImage img = processImage.image;
            percentage = CompareLetters.compare(letter, img);
            if(NearestNeighbors.isEmpty()){
                NearestNeighbors.add(0, new Neighbor(percentage, location[0]));
            }
            else {
                for (int j = 0; j < NearestNeighbors.size(); j++) {
                    if (percentage > NearestNeighbors.get(j).getPercentage()) {
                        NearestNeighbors.set(j, new Neighbor(percentage, location[0]));
                        break;
                    }
                }
                if(NearestNeighbors.size() < maxLength){
                    NearestNeighbors.set(NearestNeighbors.size()-1, new Neighbor(percentage, location[0]));
                }
            }
        }
        return NearestNeighbors;
    }

    private String classifyLetter(BufferedImage letter, FileReader train){
        ArrayList<Neighbor> Neighbors = findNearestNeighbors(letter, train);
        int [] values = new int[26];
        int current_letter;
        String max_letter = "";
        int max = 0;
        for(int i = 0; i < values.length; i++){
            values[i] = 0;
        }
        for(int i = 0; i < Neighbors.size(); i++){
            String current = Neighbors.get(i).getLetter();
            current_letter = (int) current.toCharArray()[0];
            current_letter = current_letter - 97;
            values[current_letter]++;
        }
        for(int i = 0; i < values.length; i++){
            if(values[i] > max){
                values[i] = max;
                current_letter = i + 97;
                max_letter = String.valueOf((char) current_letter);
            }
        }
        return max_letter;
    }
}
