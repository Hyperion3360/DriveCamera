// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc0.OrangeFrameEncoders;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
   
    
    // DriveTrain Software
    
    
    public static SpeedController driveTrainRightFront;
    
    public static SpeedController driveTrainRightRear;
    
    public static SpeedController driveTrainLeftFront;
    
    public static SpeedController driveTrainLeftRear;
    
    public static RobotDrive driveTrainRobotDrive41;
    
    public static DoubleSolenoid shifterSolenoid;
    
   
    public static void init() {
       
        
        //   DriveTrain Software
        
        
        driveTrainRightFront = new Victor(1, 6);
	LiveWindow.addActuator("DriveTrain", "RightFront", (Victor) driveTrainRightFront);
        
        driveTrainRightRear = new Victor(1, 5);
	LiveWindow.addActuator("DriveTrain", "RightRear", (Victor) driveTrainRightRear);
        
        driveTrainLeftFront = new Jaguar(1, 3);
	LiveWindow.addActuator("DriveTrain", "LeftFront", (Jaguar) driveTrainLeftFront);
        
        driveTrainLeftRear = new Jaguar(1, 1);
	LiveWindow.addActuator("DriveTrain", "LeftRear", (Jaguar) driveTrainLeftRear);
        
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainLeftFront, driveTrainLeftRear,
              driveTrainRightFront, driveTrainRightRear);
        
        
        shifterSolenoid = new DoubleSolenoid(1, 1, 2);
	
        
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, false);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        
        
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);
      
    }
}
