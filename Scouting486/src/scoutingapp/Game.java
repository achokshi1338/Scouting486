package scoutingapp;

import java.util.ArrayList;

public class Game {
	int year;
	Point newPointType;
	String gameName;
	ArrayList<String> competitions;
	public ArrayList<Point> pointTypes;
	
	public void createNewPointType(String pointName, String pointValue, String period){
		newPointType = new Point("high-goal", "autonomous", 5);
		this.pointTypes.add(newPointType);
	}
}
