package org;

import java.awt.*;
import java.io.IOException;

public class ClassicDung29 {
    private Utils utils;
    private Robot robot;
    private RobotActions robotActions;
    private Resizer resizer;
    private ImageToTextReader imageToTextReader;

    public ClassicDung29() throws AWTException {
        utils = new Utils();
        robot = new Robot();
        robotActions = new RobotActions();
        resizer = new Resizer();
        imageToTextReader = new ImageToTextReader();
    }

    public void startBot() throws IOException, InterruptedException, AWTException {
        Thread.sleep(4000);
        while(true){
            for(int i = 1; i <= 5; i++) {
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
            Thread.sleep(1000);

            if(robotActions.verificaDacaEroareOn()){
                solveTheWindow();
            }
            robotActions.donateXP();
            Thread.sleep(5);

            robotActions.healUp();
            Thread.sleep(27000);
            robotActions.healUp();
            Thread.sleep(36000);
            robotActions.healUp();

        }
    }

    public void solveTheWindow() throws IOException, AWTException, InterruptedException {
        TakeScreenshot.partialScreenshot();
        resizer.resize();
        String text = imageToTextReader.giveText();
        System.out.println(text);
        int nr = utils.giveResultFromString(text);
        String result = Integer.toString(nr);
        System.out.println("Result is: " + result);
        robotActions.pressEnter();

        for(int i = 0; i < result.length(); i++){
            pressNumber(result.charAt(i));
        }

        robotActions.pressEnter();

        resizer.delete();
    }

    public void pressNumber(char nr) throws InterruptedException {
        if(nr == '0')
            robotActions.useSkill0();
        if(nr == '1')
            robotActions.useSkill1();
        if(nr == '2')
            robotActions.useSkill2();
        if(nr == '3')
            robotActions.useSkill3();
        if(nr == '4')
            robotActions.useSkill4();
        if(nr == '5')
            robotActions.useSkill5();
        if(nr == '6')
            robotActions.useSkill6();
        if(nr == '7')
            robotActions.useSkill7();
        if(nr == '8')
            robotActions.useSkill8();
        if(nr == '9')
            robotActions.useSkill9();
        if(nr == '0')
            robotActions.useSkill0();

    }
}
