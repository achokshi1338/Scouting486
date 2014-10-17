package scoutingapp;

import java.util.ArrayList;

public class Match {
	
	private int[] blueAlliance = new int[3];
	private int[] redAlliance = new int[3];
	private int blueAllianceScore;
	private int redAllianceScore;
	public String gameComments;
	private ArrayList<Point> pointsScored = new ArrayList<Point>();
	private ArrayList<Point> penalties = new ArrayList<Point>();
	private Game game;
	
	public Match(int red1, int red2, int red3, int blue1, int blue2, int blue3){
		this.redAlliance[0] = red1;
		this.redAlliance[1] = red2;
		this.redAlliance[2] = red3;
		this.blueAlliance[0] = red1;
		this.blueAlliance[1] = red2;
		this.blueAlliance[2] = red3;
	}
	
	public void pointScored(int pointTypeIndex, int scoringTeam, String alliance){
		Point newScoredPoint = new Point((Point)game.pointTypes.toArray()[pointTypeIndex],scoringTeam);
		pointsScored.add(newScoredPoint);
		if (alliance == "red"){
			redAllianceScore = redAllianceScore + ((Point)game.pointTypes.toArray()[pointTypeIndex]).getPointValue();
		}
		else{
			blueAllianceScore = blueAllianceScore + ((Point)game.pointTypes.toArray()[pointTypeIndex]).getPointValue();
		}
	}
	
	public void penalty(int pointTypeIndex, int penalizedTeam, String allianceEffected){
		Point newPenalty = new Point((Point)game.pointTypes.toArray()[pointTypeIndex], penalizedTeam);
		penalties.add(newPenalty);
		if (allianceEffected == "red"){
			redAllianceScore = redAllianceScore - ((Point) game.pointTypes.toArray()[pointTypeIndex]).getPointValue();
		}
		else{
			blueAllianceScore = blueAllianceScore - ((Point) game.pointTypes.toArray()[pointTypeIndex]).getPointValue();
		}
	}
	
	public ArrayList<Point> getPointsScored(){
		return pointsScored;
	}
	public ArrayList<Point> getPenalties(){
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