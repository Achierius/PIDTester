
package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.commands.PIDTester;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    
	CANTalon tln;
	
	public ExampleSubsystem(){
		tln = new CANTalon(6);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new PIDTester());
    }
    
    public void drive(double input){
    	tln.set(input);
    }
    
    public double getPosition(){
    	return tln.getPosition();
    }
}

