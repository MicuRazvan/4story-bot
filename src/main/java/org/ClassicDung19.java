package org;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import java.awt.*;
import java.io.IOException;

public class ClassicDung19 {
    Mat source = null;
    Mat skill5Template = null;
    private Utils botUtils;
    private Robot robot;
    private int matchMethod;
    private RobotActions robotActions;

    public ClassicDung19() throws AWTException {
        botUtils = new Utils();
        robot = new Robot();
        matchMethod = Imgproc.TM_CCOEFF_NORMED;
        robotActions = new RobotActions();
        //loadObject();
    }

    public void startBot() throws IOException, InterruptedException, AWTException {
        Thread.sleep(4000);

        while(true){
            for(int i = 1; i <= 3; i++) {
                robotActions.useSkillF3();
                robotActions.useSkillF2();
                robotActions.useSkillF2();
                Thread.sleep(5500);
                robotActions.useSkillF2();
                robotActions.useSkillF2();
                Thread.sleep(5500);
                robotActions.useSkillF2();
                robotActions.useSkillF2();
                Thread.sleep(5500);
                robotActions.healUp();
            }

            robotActions.useSkillF3();
            robotActions.useSkillF2();
            robotActions.useSkillF2();
            Thread.sleep(5500);

            robotActions.useSkillX();
            robotActions.useSkillZ();
            Thread.sleep(500);
            robotActions.useSkillX();
            robotActions.useSkillZ();
            Thread.sleep(500);
            robotActions.useSkillX();
            robotActions.useSkillZ();
            Thread.sleep(500);

            robotActions.healUp();
            Thread.sleep(80000);
            robotActions.healUp();
        }
    }
}
