package org.usfirst.frc.team5770.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Forklift extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Talon forkliftMotor= new Talon(2);
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void notChristian(){
    	forkliftMotor.set(0.8);
    }
    
    public void Christian(){
    	forkliftMotor.set(-0.8);
    }
    
}

