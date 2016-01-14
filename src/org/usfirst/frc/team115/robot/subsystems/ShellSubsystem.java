
package org.usfirst.frc.team115.robot.subsystems;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.usfirst.frc.team115.robot.commands.PIDTester;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Marcus Plutowski
 */
public class ShellSubsystem extends Subsystem {
    
	CANTalon tln;
	
	static FileWriter file = new FileWriter("C:\\Users\\MVRT\\Desktop\\dT.csv");
    static PrintWriter print = new PrintWriter(file);
	public ShellSubsystem()){
		tln = new CANTalon(6);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public static void writeDT(double dt){
		print.print(dt);
		print.print(",");
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new PIDTester());
    }
    
    public void drive(double input){
    	tln.set((input < 1 ? (input > -1 ? input : -1) : 1));
    }
    
    public double getPosition(){
    	return tln.getPosition();
    }
}

