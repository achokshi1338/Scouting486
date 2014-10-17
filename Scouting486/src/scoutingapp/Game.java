package scoutingapp;

import java.util.ArrayList;

public class Game {
	int year;
	Point newPointType;
	String gameName;
	public ArrayList<Competition> competitions = new ArrayList<Competition>();
	public ArrayList<Point> pointTypes = new ArrayList<Point>();
	
	public void createNewPointType(String pointName, int pointValue, String period){
		newPointType = new Point("high-goal", "autonomous", pointValue);
		this.pointTypes.add(newPointType);
	}
	
	public void addNewCompetition(String competitionName){
		Competition newCompetition = new Competition(competitionName);
		competitions.add(newCompetition);
	}
	
}
