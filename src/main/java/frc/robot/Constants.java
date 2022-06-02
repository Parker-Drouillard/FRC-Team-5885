// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class DriveConstants {
        // Drive motors CAN IDs
        public static final int k_LeftFrontMotor = 4;
        public static final int k_LeftBackMotor = 3;
        public static final int k_RightFrontMotor = 1;
        public static final int k_RightBackMotor = 2;

        // Left/Right motor group inverted
        public static final boolean k_InvertLeftMotors = true;
        public static final boolean k_InvertRightMotors = false;

        // Drive speed constants
        public static final double k_MaxSpeed = 0.3;
        public static final double k_BoostSpeed = 0.3;
    }

    public static final class ControllerConstants {
        // Main controller (steering/lift/shooting) constants
        public static final int k_MainControllerPort = 0;
        public static final int k_BoostButton = XboxController.Button.kRightBumper.value;
    }
}
