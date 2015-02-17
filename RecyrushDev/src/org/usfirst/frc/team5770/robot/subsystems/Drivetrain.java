package org.usfirst.frc.team5770.robot.subsystems;

import org.usfirst.frc.team5770.robot.Robot;
import org.usfirst.frc.team5770.robot.commands.DriveCommand;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    private Talon leftMotor= new Talon(0);
    private Talon rightMotor= new Talon(1);
    private RobotDrive myRobot= new RobotDrive(leftMotor,rightMotor);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveCommand());
    }
    
    public void drive(double left, double right) {
    	myRobot.arcadeDrive(Robot.oi.joystick.getY(), Robot.oi.joystick.getX());
   
    	
    }
}

