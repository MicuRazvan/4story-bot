package org;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotActions {
    private Robot robot = new Robot();
    private Utils utils = new Utils();
    public RobotActions() throws AWTException {
    }

    public void leftClick() throws InterruptedException, AWTException {
        try{
            this.wait(5);
        }catch(InterruptedException e){
        }
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void rightClick() throws InterruptedException, AWTException {
        try{
            this.wait(5);
        }catch(InterruptedException e){
        }
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
    }

    public void moveMousePos(int x, int y){
        robot.mouseMove(x, y);
    }

    public void mouseLeftClick(){
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void useSkill1() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        Thread.sleep(500);
    }

    public void useSkill2() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        Thread.sleep(1000);
    }

    public void useSkill3() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_3);
        robot.keyRelease(KeyEvent.VK_3);
        Thread.sleep(500);
    }

    public void useSkill4() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_4);
        robot.keyRelease(KeyEvent.VK_4);
        Thread.sleep(1000);
    }

    public void useSkill5() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_5);
        robot.keyRelease(KeyEvent.VK_5);
        Thread.sleep(200);
    }

    public void useSkill6() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_6);
        robot.keyRelease(KeyEvent.VK_6);
        Thread.sleep(200);
    }

    public void useSkill7() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_7);
        robot.keyRelease(KeyEvent.VK_7);
        Thread.sleep(200);
    }

    public void useSkill8() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_8);
        robot.keyRelease(KeyEvent.VK_8);
        Thread.sleep(200);
    }

    public void useSkill9() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_9);
        robot.keyRelease(KeyEvent.VK_9);
        Thread.sleep(200);
    }

    public void useSkill0() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_0);
        Thread.sleep(200);
    }

    public void useSkillF1() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_F1);
        mouseLeftClick();
        robot.keyRelease(KeyEvent.VK_F1);
        Thread.sleep(1300);
    }

    public void useSkillF2() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_F2);
        robot.keyRelease(KeyEvent.VK_F2);
        Thread.sleep(5);
        robot.keyPress(KeyEvent.VK_F2);
        robot.keyRelease(KeyEvent.VK_F2);
        Thread.sleep(5);
        robot.keyPress(KeyEvent.VK_F2);
        robot.keyRelease(KeyEvent.VK_F2);
        Thread.sleep(5);
        robot.keyPress(KeyEvent.VK_F2);
        robot.keyRelease(KeyEvent.VK_F2);
        //Thread.sleep(500);
    }

    public void useSkillF3() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_F3);
        robot.keyRelease(KeyEvent.VK_F3);
        //Thread.sleep(500);
    }

    public void useSkillG() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_G);
        Thread.sleep(1000);
    }

    public void useSkillF10() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_F10);
        robot.keyRelease(KeyEvent.VK_F10);
        Thread.sleep(1000);
    }

    public void useSkillF11() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_F11);
        Thread.sleep(1000);
    }

    public void openCloseMap(){
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
    }

    public void mountUnmountAncient(){
        robot.keyPress(KeyEvent.VK_F12);
        robot.keyRelease('a');
    }

    public void useSkillZ(){
        robot.keyPress(KeyEvent.VK_Z);
        robot.keyRelease(KeyEvent.VK_Z);
    }

    public void useSkillX(){
        robot.keyPress(KeyEvent.VK_X);
        robot.keyRelease(KeyEvent.VK_X);
    }

    public void healUp(){
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_F11);
    }

    public void pressEnter(){
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public boolean verificaDacaEroareOn() throws IOException, AWTException, InterruptedException {
        Mat tempSource = TakeScreenshot.fullScreenshot();
        Mat template = Imgcodecs.imread("template.png");
        double templateIcon = utils.getMaxVal(tempSource, template, new Mat(), Imgproc.TM_CCOEFF_NORMED);
        System.out.println(templateIcon);
        if (templateIcon > 0.5) {
            System.out.println("Da");
            return true;
        }

        return false;
    }

    public void donateXP() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        moveMousePos(420,570);
        mouseLeftClick();
        Thread.sleep(5);
        moveMousePos(680,350);
        Thread.sleep(1500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        moveMousePos(800, 350);
        Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5);
        moveMousePos(650, 385);
        Thread.sleep(5);
        mouseLeftClick();
        Thread.sleep(5);
        moveMousePos(850,580);
        Thread.sleep(5);
        mouseLeftClick();
        Thread.sleep(5);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_SHIFT);
    }

    public boolean verificaDacaPallaOn() throws IOException, AWTException, InterruptedException {
        Mat tempSource = TakeScreenshot.fullScreenshot();
        Mat template = Imgcodecs.imread("paladium.png");
        double templateIcon = utils.getMaxVal(tempSource, template, new Mat(), Imgproc.TM_CCOEFF_NORMED);
        System.out.println(templateIcon);
        if (templateIcon > 0.6) {
            Point coordonates = getMatchLoc(tempSource, template, new Mat(), Imgproc.TM_CCOEFF_NORMED);
            moveMousePos((int) coordonates.x+5, (int) coordonates.y+5);
            Thread.sleep(500);
            mouseLeftClick();
            Thread.sleep(2000);
            System.out.println(coordonates);
            System.out.println("Da");
            return true;
        }

        return false;
    }

    public org.opencv.core.Point getMatchLoc(Mat source, Mat template, Mat outputImage, int matchMethod) {
        Imgproc.matchTemplate(source, template, outputImage, matchMethod);
        Core.MinMaxLocResult mmr = Core.minMaxLoc(outputImage);
        org.opencv.core.Point matchLoc = mmr.maxLoc;
        return matchLoc;
    }

}
