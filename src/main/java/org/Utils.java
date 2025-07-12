package org;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;


import java.awt.event.InputEvent;
import java.awt.Robot;
import org.opencv.core.Point;

public class Utils {

    public Utils() {

    }

    public Point getMiddle(Mat template, Point point) {

        int topLeft_x = (int) point.x;
        int topLeft_y = (int) point.y;

        int rightBottom_x = (int) point.x + template.cols();
        int rightBottom_y = (int) point.y + template.rows();

        int mid_x = (topLeft_x + rightBottom_x) / 2;
        int mid_y = (topLeft_y + rightBottom_y) / 2;

        return new Point(mid_x, mid_y);
    }

    public void clickButton(Mat template, Point matchLoc, Robot robot) {

        robot.mouseMove((int) getMiddle(template, matchLoc).x, (int) getMiddle(template, matchLoc).y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }

    public void drawRectangle(Mat source, Mat template, Point matchLoc) {
        Imgproc.rectangle(source, matchLoc, new Point(matchLoc.x + template.cols(), matchLoc.y + template.rows()),
                new Scalar(255, 255, 255));
    }

    public double getMaxVal(Mat source, Mat template, Mat outputImage, int matchMethod) {
        Imgproc.matchTemplate(source, template, outputImage, matchMethod);
        double max = Core.minMaxLoc(outputImage).maxVal;
        return max;
    }

    public Point getMatchLoc(Mat source, Mat template, Mat outputImage, int matchMethod) {
        Imgproc.matchTemplate(source, template, outputImage, matchMethod);
        Core.MinMaxLocResult mmr = Core.minMaxLoc(outputImage);
        Point matchLoc = mmr.maxLoc;
        return matchLoc;
    }

    public int giveResultFromString(String string){
        int result;
        int nr1 = 0;
        int nr2 = 0;
        boolean found = false;
        int index = string.indexOf( "Please");
        for(int i = index; i < string.length(); i++){
            if(string.charAt(i) >= 48 && string.charAt(i) <= 58){
                if(found == false) {
                    nr1 = nr1 * 10 + string.charAt(i) - 48;
                }
                else{
                    nr2 = nr2 * 10 + string.charAt(i) - 48;
                }
            }

            if(nr1 != 0 && string.charAt(i) == '+')
                found = true;

            if(nr2 != 0 && (string.charAt(i) > 58 || string.charAt(i) < 48))
                break;
        }

        System.out.println("Numarul 1: " + nr1);
        System.out.println("Numarul 2: " + nr2);
        return nr1+nr2;
    }
}