package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.Robot;
import org.usfirst.frc.team115.robot.subsystems.ShellSubsystem;
import edu.wpi.first.wpilibj.command.PIDCommand;

public class PIDTester extends PIDCommand{
	
	private static final double kP = 0.1;
	private static final double kI = 0.0;
	private static final double kD = 0.0;
	private double time;
	
	public PIDTester() {
		super(kP, kI, kD);
		
	}

	@Override
	protected double returnPIDInput() {
		return Robot.exampleSubsystem.getPosition();
	}

	@Override
	protected void usePIDOutput(double output) {
		
	}

	@Override
	protected void initialize() {
		time = System.currentTimeMillis();
	}

	@Override
	protected void execute() {
		ShellSubsystem.writeDT(System.currentTimeMillis()-time);
		time = System.currentTimeMillis();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
	
	

}
