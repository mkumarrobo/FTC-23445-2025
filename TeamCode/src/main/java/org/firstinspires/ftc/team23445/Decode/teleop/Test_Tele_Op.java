package org.firstinspires.ftc.team23445.Decode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Simple test to verify which motor is connected to which port and check forward direction.
 */
@TeleOp(name = "Motor Test OpMode", group = "Testing")
public class Test_Tele_Op extends LinearOpMode {

    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;

    @Override
    public void runOpMode() {

        frontLeft = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        frontRight = hardwareMap.get(DcMotor.class, "frontRightMotor");
        backLeft = hardwareMap.get(DcMotor.class, "backLeftMotor");
        backRight = hardwareMap.get(DcMotor.class, "backRightMotor");

        // Optionally reverse motors if needed
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {

            testMotor(frontLeft, "Front Left");
            testMotor(frontRight, "Front Right");
            testMotor(backLeft, "Back Left");
            testMotor(backRight, "Back Right");

            telemetry.addData("Status", "Test Complete");
            telemetry.update();

            sleep(3000); // Wait before ending
            break;
        }
    }

    private void testMotor(DcMotor motor, String name) {
        telemetry.addData("Testing", name);
        telemetry.update();

        motor.setPower(0.5);
        sleep(2000);
        motor.setPower(0);
        sleep(500);
    }
}
