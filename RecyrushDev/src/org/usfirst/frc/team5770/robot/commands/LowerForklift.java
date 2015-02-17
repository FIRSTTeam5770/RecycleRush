package org.usfirst.frc.team5770.robot.commands;

import org.usfirst.frc.team5770.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LowerForklift extends Command {

    public LowerForklift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.forklift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Tells the talon to move the motor in the downward position to lower the motor. 
    	Robot.forklift.Christian();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
