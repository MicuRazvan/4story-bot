package org;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Ancient {
    Mat source = null;
    Mat skill5Template = null;
    private Utils botUtils;
    private Robot robot;
    private int matchMethod;
    private RobotActions robotActions;

    public Ancient() throws AWTException {
        botUtils = new Utils();
        robot = new Robot();
        matchMethod = Imgproc.TM_CCOEFF_NORMED;
        robotActions = new RobotActions();
        loadObject();
    }

    public void loadObject(){
        skill5Template =  Imgcodecs.imread("C:\\Users\\flore\\OneDrive\\Desktop\\4story-imgs\\" + "5.png");
    }

    public void startBot() throws IOException, InterruptedException, AWTException {
        Thread.sleep(4000);

        goToStartingPoint();
        for(int i = 0; i < 30; i++){
            goToKillPosition();
            Thread.sleep(1300);
            fight();
            goBackToSafePosition();
        }
    }

//    public void useSkill5() throws IOException, AWTException, InterruptedException {
//        Mat tempSource = TakeScreenshot.fullScreenshot();
//        Mat skill5OutPutImage = new Mat();
//        double skill5Icon = _botUtils.getMaxVal(tempSource, skill5Template, skill5OutPutImage, _matchMethod);
//        System.out.println(skill5Icon);
//        if (skill5Icon > 0.5) {
//            _robot.keyPress(KeyEvent.VK_5);
//            _robot.keyRelease(KeyEvent.VK_5);
//            Thread.sleep(1300);
//        }
//    }



    public void goToStartingPoint() throws InterruptedException {
        robotActions.mountUnmountAncient();
        Thread.sleep(3000);
        robotActions.openCloseMap();
        Thread.sleep(300);
        robotActions.moveMousePos(1055, 560);
        Thread.sleep(300);
        robotActions.mouseLeftClick();
        Thread.sleep(300);
        robotActions.openCloseMap();
        Thread.sleep(60000);
        robotActions.mountUnmountAncient();
        Thread.sleep(300);
        robotActions.useSkill5();
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(1150);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(1000);
    }

    public void goToKillPosition() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(13000);
        robot.keyRelease(KeyEvent.VK_W);
    }

    public void fight() throws InterruptedException {
        robotActions.moveMousePos(970, 670);
        Thread.sleep(300);
        robotActions.useSkillF3();
        robotActions.useSkillF11();
        Thread.sleep(400);
        robotActions.useSkillF1();
        robotActions.useSkillF1();
        robotActions.useSkillF1();
        robotActions.useSkill4();
        Thread.sleep(500);
        robotActions.useSkill2();
        robotActions.useSkillF2();
        robotActions.useSkillF11();
        robotActions.useSkill1();
        robotActions.useSkillG();
        robotActions.useSkillF10();
        robotActions.useSkill1();
        robotActions.useSkill2();
        robotActions.useSkill4();
        robotActions.useSkill1();
        robotActions.useSkillG();
        robotActions.useSkill1();
        robotActions.useSkill2();
        robotActions.useSkill4();
        robotActions.useSkill1();
        robotActions.useSkillF11();
        robotActions.useSkill1();
        robotActions.useSkill2();
        robotActions.useSkill1();
        robotActions.useSkillF3();
        robotActions.useSkill1();
        robotActions.useSkill2();
        Thread.sleep(1500);
        robotActions.useSkillF11();
        robotActions.useSkill4();
        robotActions.useSkillF1();
        robotActions.useSkillF1();
        robotActions.useSkillF1();
        Thread.sleep(200);
        robotActions.useSkillF3();
        robotActions.useSkill2();
        robotActions.useSkillG();
        robotActions.useSkill4();
    }

    public void goBackToSafePosition() throws InterruptedException {
        robotActions.openCloseMap();
        Thread.sleep(200);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(500);
        robotActions.moveMousePos(500, 700);
        Thread.sleep(500);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(500);
        robotActions.moveMousePos(1040, 560);
        Thread.sleep(200);
        robotActions.mouseLeftClick();
        Thread.sleep(200);
        robotActions.openCloseMap();
        Thread.sleep(20000);
        robotActions.useSkill5();

        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(1950);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(22000);
    }
}
