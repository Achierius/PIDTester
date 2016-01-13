package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.Robot;

import edu.wpi.first.wpilibj.command.PIDCommand;

public class PIDTester extends PIDCommand{
	
	private static final double kP = 0.1;
	private static final double kI = 0.0;
	private static final double kD = 0.0;

	public PIDTester() {
		super(kP, kI, kD);
		
	}

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return Robot.exampleSubsystem.getPosition();
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		double time = System.currentTimeMillis();
		System.out.println(time);
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
	
	

}
