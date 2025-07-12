package org;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ImageToTextReader {
    private Tesseract tesserect;
    public ImageToTextReader(){
        tesserect = new Tesseract();
    }

    public String giveText(){
        try {
            tesserect.setDatapath("C:\\Users\\flore\\OneDrive\\Desktop\\bot\\tessdata");
            String text = tesserect.doOCR(new File("tempResized.png"));
            return text;
        }
        catch (TesseractException e){
            e.printStackTrace();
        }
        return " ";
    }

}
