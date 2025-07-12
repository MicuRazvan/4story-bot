package org;

import org.opencv.core.Mat;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    public TakeScreenshot() {
    }

    public static Mat fullScreenshot() throws AWTException, IOException {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle captureRect = new Rectangle(0, 0, screenSize.width, screenSize.height);

        BufferedImage capture = new Robot().createScreenCapture(captureRect);
        Mat cap = BufferedImageToMat.BufferedImage2Mat(capture);
        return cap;
    }

    public static void partialScreenshot() throws AWTException, IOException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle captureRect = new Rectangle(800, 470, 300, 135);

        BufferedImage capture = new Robot().createScreenCapture(captureRect);

        File outputfile = new File("ss.png");
        ImageIO.write(capture, "png", outputfile);
    }

}