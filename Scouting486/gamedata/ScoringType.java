package gamedata;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("scoringtype")
public class ScoringType {
	private String name;
	private int points;
	private String team;
}
