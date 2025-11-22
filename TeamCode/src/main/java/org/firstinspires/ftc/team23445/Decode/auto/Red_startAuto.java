package org.firstinspires.ftc.team23445.Decode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.team23445.Decode.AutonomousPLUS;
import org.firstinspires.ftc.team23445.Decode.Starmont_Bot;

@Autonomous(group = "Basic", name = "Red_startAuto")
public class Red_startAuto extends AutonomousPLUS {

    @Override
    public void runOpMode() {

        robot = new Starmont_Bot(hardwareMap, telemetry, this);

        // Reset encoders and prepare arm
        prepareAuto();

        telemetry.addLine("Ready to start");
        telemetry.update();

        waitForStart();
        if (!opModeIsActive()) return;

        int forwardTicks = convertInchesToTicks(80);
        int leftturn = convertInchesToTicks(12);

        moveRobotForward(forwardTicks, 200);
        robot.backArm.setPower(0.75);
        turnRobotLeft (leftturn, 200);
        prepareNextAction(300);
        robot.frontMove.setPower(-0.8);
        robot.frontServo.setDirection(Servo.Direction.REVERSE);
        robot.frontServo.setPosition(1.0);
        prepareNextAction(100);
        robot.frontArm.setPower(0.9);
        prepareNextAction(13000);
        robot.backArm.setPower(0);
        robot.frontServo.setPosition(0.5);
        robot.frontMove.setPower(0);
        robot.frontArm.setPower(0);
        turnRobotRight (leftturn, 200);

    }
}
