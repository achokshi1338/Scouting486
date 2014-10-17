package scoutingapp;

import java.util.ArrayList;

public class Game {
	int year;
	Point newPointType;
	String gameName;
	ArrayList<String> competitions = new ArrayList<String>();
	public ArrayList<Point> pointTypes = new ArrayList<Point>();
	
	public void createNewPointType(String pointName, int pointValue, String period){
		newPointType = new Point("high-goal", "autonomous", pointValue);
		this.pointTypes.add(newPointType);
	}
}
