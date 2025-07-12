package org;

import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;

public class Resizer {
    public Resizer(){
    }

    public void resize() throws IOException {
        Thumbnails.of("ss.png").size(1920, 1080).toFile("tempResized.png");
    }

    public void delete(){
        File f= new File("tempResized.png");
        try {
            if(f.delete()) {
                System.out.println(f.getName() + " deleted");
            }
            else {
                System.out.println("failed");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        f = new File("ss.png");
        try {
            if(f.delete()) {
                System.out.println(f.getName() + " deleted");
            }
            else {
                System.out.println("failed");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
