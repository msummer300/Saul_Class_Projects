package AutumnSummersProject;

import org.opencv.core.*;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Autumn on 10/4/2016.
 */
public class ImageReader {
    public String img;
    public String [] img_array;

    //interprets an image based on the string representation of it's location
    public ImageReader(String location) {
        try {
            //this bit is a slightly altered version of code I found on StackOverflow
            //the link to the question is here http://stackoverflow.com/questions/23134304/crop-out-part-from-images-findcontours-opencv-java
            //I can't in good conscience claim this for my own, but I really needed some code that works
            //and I barely know anything about opencv
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat image = Highgui.imread("data/AutumnSummersData/" + location);

            Mat eightBitImage = new Mat(image.rows(), image.cols(), CvType.CV_8UC1);
            eightBitImage.convertTo(image, CvType.CV_8UC1);
            Mat original = image.clone();

            //Imgproc.threshold(image, image, 100, 128, Imgproc.THRESH_BINARY_INV);



            int x_center = image.width()/2;
            int y_center = image.height()/2;
            Point image_center = new Point(x_center, y_center);

            ArrayList<MatOfPoint> contours = new ArrayList<MatOfPoint>();
            Mat hierarchy = new Mat();


            Imgproc.findContours(image, contours, hierarchy, Imgproc.RETR_CCOMP, Imgproc.CHAIN_APPROX_SIMPLE);


            /*double d_min = Double.MAX_VALUE;
            Rect rect_min = new Rect();
            for (MatOfPoint contour : contours) {
                Rect rec = Imgproc.boundingRect(contour);
                // find the best candidates
                if (rec.height > image.height()/2 & rec.width > image.width()/2)
                    continue;
                Point2D pt1 = new Point2D.Double((double)rec.x, (double)rec.y);
                Point2D center = new Point2D.Double(rec.x+(double)(rec.width)/2, rec.y + (double)(rec.height)/2);
                double d = Math.sqrt(Math.pow((double)(pt1.getX() - image_center.x),2) + Math.pow((double)(pt1.getY() -image_center.y), 2));
                if (d < d_min)
                {
                    d_min = d;
                    rect_min = rec;
                }
            }

            if(rect_min.height > rect_min.width){
                rect_min.width = rect_min.height;
                rect_min.height = rect_min.height;
            }
            else{
                rect_min.height = rect_min.width;
                rect_min.width = rect_min.width;
            }

            Mat result = original.submat(rect_min);

*/
            //this is where it becomes my original code again
            img = "";
            String current;
            Size sz = new Size(32, 32);
            Mat resized = new Mat();
            Imgproc.resize(image, resized, sz);

            img = resized.dump();
            //System.out.println(img);

        }
        catch (Exception e){}
    }

}

