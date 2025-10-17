package org.firstinspires.ftc.team23445.Decode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import org.firstinspires.ftc.team23445.Decode.AutonomousPLUS;

@Disabled //TODO delete the @Disabled to make the auto show up
@Autonomous(group = "Basic", name = "sample") //TODO name your auto
public class emptyAuto extends AutonomousPLUS {

    public void runOpMode() { // This function will run when you initialize the program

        super.runOpMode(); // Robot constructor

        waitForStart(); // Waits for start

        //TODO add your step-by step code here using functions from AutonomousPLUS
        
        prepareNextAction(2000);

        // end auto

    }

    // if you want to add any functions unique to this auto, do it here

}