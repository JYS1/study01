import java.util.Scanner;

import javax.security.auth.Subject;

public class Insert {
	Scanner sc = new Scanner( System.in );
	int SUBJECT_COUNT=3;
	private String name;
	private int total;
	private int subject[] = new int[SUBJECT_COUNT];
	
	public Insert(String name, int[] subject) {
		this.name = name;
		
		int i = 0;
		for(int score : subject) {
			this.subject[i++] = score;
		}
		this.total  = 0;
		calculate();
	}
	public void calculate() {
		for(int score : subject) {
			total += score;
		}
	}
}
