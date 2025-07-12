package org;

import java.awt.*;
import java.io.IOException;

public class DarkOrbitPalaCollector {
    private Utils utils;
    private Robot robot;
    private RobotActions robotActions;

    public DarkOrbitPalaCollector() throws AWTException {
        utils = new Utils();
        robot = new Robot();
        robotActions = new RobotActions();
    }

    public void start() throws InterruptedException, IOException, AWTException {
        Thread.sleep(2000);
        int rounds = 0;
        while(true){
            if(rounds == 1500){
                rounds = 0;
                this.goAtStart();
            }
            robotActions.verificaDacaPallaOn();


            rounds++;
            Thread.sleep(50);
        }
    }

    public void goAtStart() throws InterruptedException {
        robotActions.moveMousePos(1800,1000);
        Thread.sleep(5);
        robotActions.mouseLeftClick();
        Thread.sleep(2000);
        robotActions.moveMousePos(1820,1000);
        Thread.sleep(5);
        robotActions.mouseLeftClick();
        Thread.sleep(5);
    }
}
