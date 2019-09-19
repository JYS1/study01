package Test01;

public class Student {
	protected String name;
	protected String subject;
	protected static int number;
	
	private InfoControl infoControl;
	private ScoreControl scoreControl;
	
	public Student() {
		infoControl = new InfoControl();
		scoreControl = new ScoreControl();
	}
	
	public void appendInfo(String name, String subject, int number) {
		infoControl.appendInfo(name, subject, number);
	}
	public void appendScoreInfo(String name, int[] majors, int[] commons) {
		scoreControl.appendScoreInfo(name, majors, commons);
	}
	
	public int searchInfo( String name ) {
		return infoControl.searchInfo(name);
	}
	  
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}

	public int getNumber() {
		return number;
	}
}
