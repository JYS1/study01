package Test01;

public class Entity {
	public static final int MAX_SUBJECT = 3;
	public static final int EXCELLENT = 90;
	public static final int FAIL = 60;
	
	public String name;
	

	private int subject1;
	private int subject2;
	private int subject3;
	private int total;
	private double average;
	private String grade;
	private int rank = 1;



	public Entity(String name,
			int subject1, int subject2, int subject3
			, int total,
			double average, String grade) {
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.total = total;
		this.average = average;
		this.grade = grade;
	}
	
	


	public static int getMaxSubject() {
		return MAX_SUBJECT;
	}
	public static int getExcellent() {
		return EXCELLENT;
	}
	public static int getFail() {
		return FAIL;
	}
	public String getName() {
		return name;
	}
	public int getTotal() {
		return total;
	}
	public double getAverage() {
		return average;
	}
	public String getGrade() {
		return grade;
	}
	
	public int getSubject1() {
		return subject1;
	}

	public int getSubject2() {
		return subject2;
	}

	public int getSubject3() {
		return subject3;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}


















