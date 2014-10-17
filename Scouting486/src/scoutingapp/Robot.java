package scoutingapp;

import java.util.ArrayList;

public class Robot {
	
	int teamNumber;
	String playerType;
	ArrayList<Point> pointsScored = new ArrayList<Point>();
	ArrayList<Point> penaltiesEarned = new ArrayList<Point>();
	
	public Robot(int teamNumber){
		this.teamNumber = teamNumber;
	}
}
