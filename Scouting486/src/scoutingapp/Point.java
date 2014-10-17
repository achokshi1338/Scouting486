package scoutingapp;

public class Point {
	
	String pointName;
	int pointValue;
	int scoringTeam;
	String period;
	
	public Point(String pointName, int pointValue, int scoringTeam, String period){
		this.pointName = pointName;
		this.pointValue = pointValue;
		this.scoringTeam = scoringTeam;
		this.period = period;
	}
}
