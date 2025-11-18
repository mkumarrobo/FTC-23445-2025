package org.firstinspires.ftc.team23445.Decode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.team23445.Decode.AutonomousPLUS;
import org.firstinspires.ftc.team23445.Decode.Starmont_Bot;

 //TODO delete the @Disabled to make the auto show up
@Autonomous(group = "Basic", name = "startAuto") //TODO name your auto
public class startAuto extends AutonomousPLUS {

    //DO NOT DELETE THIS LINE! CAPITALIZATION IS VERY IMPORTANT!!!
    public org.firstinspires.ftc.team23445.Decode.Starmont_Bot robot = null;

    public void runOpMode() { // This function will run when you initialize the program

        robot = new Starmont_Bot(hardwareMap, telemetry, this);

        super.runOpMode(); // Robot constructor

        waitForStart(); // Waits for start

        //TODO add your step-by step code here using functions from AutonomousPLUS
        moveRobotForward(1000,100);
        prepareNextAction(2000);

        // end auto

    }

    // if you want to add any functions unique to this auto, do it here

}