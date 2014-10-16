package io.github.positronictraining.scoutingapp.games;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("gamedata")
public class GameData{
	
	@XStreamAlias("name")
	private String name;
	@XStreamAlias("year")
	private int year;
	@XStreamAlias("finalScore")
	private int finalScore;
	@XStreamAlias("redAlliance")
	private String[] redAlliance;
	@XStreamAlias("blueAlliance")
	private String[] blueAlliance;
	@XStreamAlias("victor")
	private String[] victor;
	
	@XStreamImplicit(itemFieldName="period")
	private List<PeriodData> periods;
}
