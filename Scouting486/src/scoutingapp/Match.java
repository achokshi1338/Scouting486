package scoutingapp;

import java.util.Arrays;
import java.util.ArrayList;

public class Match {
	
	private int[] blueAlliance = new int[3];
	private int[] redAlliance = new int[3];
	private int blueAllianceScore;
	private int redAllianceScore;
	public String gameComments;
	private Point[] pointsScored;
	private ArrayList<Point> pointsScoredList = new ArrayList<Point>(Arrays.asList(pointsScored));
	private Point[] penalties;
	private ArrayList<Point> penaltiesList = new ArrayList<Point>(Arrays.asList(penalties));
	
	public Match(int red1, int red2, int red3, int blue1, int blue2, int blue3){
		this.redAlliance[0] = red1;
		this.redAlliance[1] = red2;
		this.redAlliance[2] = red3;
		this.blueAlliance[0] = red1;
		this.blueAlliance[1] = red2;
		this.blueAlliance[2] = red3;
	}
	
	public void pointScored(String pointName, int pointValue, int scoringTeam, String period, String alliance){
		Point newScoredPoint = new Point(pointName,pointValue,scoringTeam, period);
		pointsScoredList.add(newScoredPoint);
		this.pointsScored = (Point[]) pointsScoredList.toArray();
		if (alliance == "red"){
			redAllianceScore = redAllianceScore + pointValue;
		}
		else{
			blueAllianceScore = blueAllianceScore + pointValue;
		}
	}
	
	public void penalty(String penaltyDescription, int penaltyValue, int penalizedTeam, String allianceEffected){
		Point newPenalty = new Point(penaltyDescription, penaltyValue, penalizedTeam, "penalty");
		penaltiesList.add(newPenalty);
		this.penalties = (Point[]) penaltiesList.toArray();
		if (allianceEffected == "red"){
			redAllianceScore = redAllianceScore - penaltyValue;
		}
		else{
			blueAllianceScore = blueAllianceScore - penaltyValue;
		}
	}
	
	public Point[] getPointsScored(){
		return pointsScored;	
	}
	
	public Point[] getPenalties(){
		return penalties;
	}
	
	public int[] redAlliance(){
		return redAlliance;
	}
	
	public int[] blueAlliance(){
		return blueAlliance;
	}
	
	public int getRedAllianceScore(){
		return redAllianceScore;
	}
	
	public int getBlueAllianceScore(){
		return blueAllianceScore;
	}

}