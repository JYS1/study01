package Test01;

import java.util.*;

public class ScoreControl {
	private List<Score> score;
	
	ScoreControl() {
		score = new ArrayList<>();
	}
	
	public void appendScoreInfo(String name,int[] majors, int[] commons) {
		score.add(new Score(name, majors, commons));
	}
}
