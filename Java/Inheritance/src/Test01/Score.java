package Test01;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Score extends Student {
	private static final int EXCELLENT = 90;
	public static final int FAIL = 60;
	private final int COMMON_COUNT = 3;
	
	private int[] majors = new int[number];
	private int[] commons = new int[COMMON_COUNT];
	private int total;
	private double average;
	private int rank;
	private String grade;
	
	public Score (String name, int[] major, int[]common) {
		this.name = name;
		
		int i = 0;
		for(int score : major) {
			this.majors[i++] = score;
		}
		for(int score : common) {
			this.commons[i] = score;
		}
		this.total = 0;
		
		calcSocre();
		
		this.rank = 1;
	}

	
	private void calcSocre() {
		for( int score : majors ) {
			total += score;
		}
		for( int score : commons ) {
			total += score;
		}
		
		average = total / (double)(number + COMMON_COUNT);
		
		if ( average >= EXCELLENT ) {
			grade = "Excellent";
		} else if ( average < FAIL ) {
			grade = "Fail";
		} else {
			grade = "";
		}
		

		
	}




	
	
	public int[] getMajors() {
		return majors;
	}

	public int[] getCommons() {
		return commons;
	}

	public int getTotal() {
		return total;
	}

	public double getAverage() {
		return average;
	}

	public int getRank() {
		return rank;
	}

	public String getGrade() {
		return grade;
	}
	
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		str.append( String.format("%-10s %-10s %3d %3d %3d %5.1f 1d -10s"
				, name, subject, majors, commons, total, average, rank, grade));
		
		return str.toString();
	}
	
}
