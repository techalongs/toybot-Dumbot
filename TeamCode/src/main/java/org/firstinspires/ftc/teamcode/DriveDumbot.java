package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Walking Dumbot - Drive Practice")
public class DriveDumbot extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Robot robot = new Robot(hardwareMap);

        telemetry.addData("Status", "Ready");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.right_bumper) robot.drive(gamepad1, 1);
            else if (gamepad1.left_bumper) robot.drive(gamepad1, 0.5);
            else robot.drive(gamepad1, 0.8);
            robot.controlArm(gamepad1, 1);
            robot.displayData(telemetry);
        }
    }
}
