package com.collabera.builder;

public class RobotEngineer {

	private RobotBuilder robotBuilder;
	
	public RobotEngineer(RobotBuilder robotBuilder) {
		
		this.robotBuilder = robotBuilder;
		
	}
	
	public Robot getRobot() {
		
		return this.robotBuilder.getRobot();
		
	}
	
	public void makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
		this.robotBuilder.buildRobotTorso();
	}
}
