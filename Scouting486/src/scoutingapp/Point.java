package scoutingapp;

public class Point {
	
	private String pointName;
	private int pointValue;
	private int scoringTeam;
	private String pointPeriod;
	
	public Point(String pointName, String pointPeriod, int pointValue){
		this.pointName = pointName;
		this.pointValue = pointValue;
		this.pointPeriod = pointPeriod;
	}

 	public Point(Point pointType, int team){
		this.pointName = pointType.pointName;
		this.pointPeriod = pointType.pointPeriod;
		this.pointValue = pointType.pointValue;
		this.scoringTeam = team;
 	}
	
	public String getPointName(){
		return this.pointName;
	}
	public int getPointValue(){
		return this.pointValue;
	}
	public int getScoringTeam(){
		return this.scoringTeam;
	}
	public String getPointPeriod(){
		return this.pointPeriod;
	}
}
