package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.PIDCoefficients;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import com.z3db0y.davidlib.Vector;

@Config
public class Configurable {
    // Tunable variables to tune from the dashboard, must be public and static so the dashboard can access them.
    // Always have to be in cm!!!
    // Constants and ratios
    public static double collectorPower = 1;
    public static double conveyorPower = 1;

     // Drivetrain
     public static double wheelRadius = 90.0/10.0/2.0;
     public static int motorTicksPerRevolution = 12 * 28;

    // Dimensions are wheel-to-wheel
    public static double robotWidth = 39;
    public static double robotDepth = 30;
    public static double robotHeight = 50;

    public static double centerToShooter = 13.5;

    public static double paragondas = 1.45;
    public static double shooterWheelRadiusStart = 2.5;
    public static double shooterWheelMaxExpansion = 2;
    public static double shooterGearRatio = 90.0/30.0;
    public static int shooterMaxVelo = 2500;
    public static double shooterAngle = 60.0;

    public static double ballDiameter = 9;

    public static double shooterStep = 10;
    public static double shooterMarginOfError = 0.5;

    public static Vector sinkCenterLocation = new Vector(300, 250, 350);
}
