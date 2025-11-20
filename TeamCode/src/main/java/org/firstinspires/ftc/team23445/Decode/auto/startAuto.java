package org.firstinspires.ftc.team23445.Decode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.firstinspires.ftc.team23445.Decode.AutonomousPLUS;
import org.firstinspires.ftc.team23445.Decode.Starmont_Bot;

@Autonomous(group = "Basic", name = "startAuto")
public class startAuto extends AutonomousPLUS {

    @Override
    public void runOpMode() {

        robot = new Starmont_Bot(hardwareMap, telemetry, this);

        // Reset encoders and prepare arm
        prepareAuto();

        telemetry.addLine("Ready to start");
        telemetry.update();

        waitForStart();
        if (!opModeIsActive()) return;

        // Convert 6 inches to encoder ticks
        int forwardTicks = convertInchesToTicks(6);

        moveRobotForward(forwardTicks, 300);

        telemetry.addLine("Finished moving 6 inches");
        telemetry.update();
        prepareNextAction(300);
        // Add more steps if needed:
         //moveRobotLeft(800, 200);
        // turnRobotRight(500, 300);
        // moveFrontArm(500, 0.8, 500);

    }
}
