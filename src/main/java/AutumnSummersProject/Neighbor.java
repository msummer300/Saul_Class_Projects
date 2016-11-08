package AutumnSummersProject;

/**
 * Created by Autumn on 10/27/2016.
 */
public class Neighbor {
    private int percentage;
    private String letter;

    public Neighbor(int p, String val){
        percentage = p;
        letter = val;
    }

    public int getPercentage(){
        return percentage;
    }

    public String getLetter() {
        return letter;
    }
}
