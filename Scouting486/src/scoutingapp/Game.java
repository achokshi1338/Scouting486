package scoutingapp;

import java.util.Arrays;
import java.util.ArrayList;

public class Game {
	int year;
	String gameName;
	String[] competitions;
	public String[][] pointTypes = new String[3][];
	private ArrayList<String[]> pointTypesList = new ArrayList<String[]>(Arrays.asList(pointTypes));
	
	public void createNewPointType(String pointName, String pointValue, String period){
		String[] newPointType = {pointName,pointValue,period};
		this.pointTypesList.add(newPointType);
		this.pointTypes = (String[][]) pointTypesList.toArray();
	}
}
