package scoutingapp;

import java.util.ArrayList;

public class Competition {
	
	public String competitionName;
	public ArrayList<Robot> robots = new ArrayList<Robot>();
	public ArrayList<Match> matches = new ArrayList<Match>();
	
	public Competition(String competitionName){
		this.competitionName = competitionName;
	}
	
	public void addRobot(int teamNumber){
		Robot newRobot = new Robot(teamNumber);
		robots.add(newRobot);
	}
	
	public void addMatch(int red1, int red2, int red3, int blue1, int blue2, int blue3){
		Match newMatch = new Match(red1, red2, red3, blue1, blue2, blue3);
		matches.add(newMatch);
	}
}
