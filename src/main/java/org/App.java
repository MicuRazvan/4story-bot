package org;

import net.coobird.thumbnailator.Thumbnails;
import org.opencv.core.Core;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws AWTException, IOException, InterruptedException {
        System.setProperty("sun.java2d.uiScale", "1");
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        ClassicDung29 classicDung29 = new ClassicDung29();
        classicDung29.startBot();

        //DarkOrbitPalaCollector darkOrbitPalaCollector = new DarkOrbitPalaCollector();
        //darkOrbitPalaCollector.start();

    }

}

