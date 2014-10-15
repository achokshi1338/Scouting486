package io.github.positronictraining.scoutingapp.games;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("scoringtypedata")
public class ScoringTypeData {
	private String name;
	private int points;
	private String team;
}
