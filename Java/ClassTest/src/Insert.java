import java.util.Scanner;

public class Insert {
	Scanner sc = new Scanner( System.in );
	int MAX = 10;
	private String name;
	private int number1;
	private int number2;
	private int number3;
	private String name_count;
	
	public Insert() {
		System.out.println("�̸��� 'end' �̰ų� 10���� �Ǹ� ����.");
		for ( int i = 0; i < MAX; ++i ) {
			System.out.printf("[ "+(i+1) + " ] ��° �л� �̸� �Է�  : ", i + 1 );
			this.name_count = sc.nextLine();
			this.name = name_count;
			if ( name.equals("end") ) {
				MAX = i;
			} else {
				System.out.print("   1 ��° ���� ���� �Է� : " );
				this.number1 = Integer.parseInt( sc.nextLine() );
				System.out.print("   2 ��° ���� ���� �Է� : " );
				this.number2 = Integer.parseInt( sc.nextLine() );
				System.out.print("   3 ��° ���� ���� �Է� : " );
				this.number3 = Integer.parseInt( sc.nextLine() );
			}
		}
		System.out.println();
		for( int i = 0; i < MAX; i++) {
			
			int sum;
			sum = (this.number1 + this.number2 + this.number3);
			double avg = sum/3;
			if(avg >= 90) {
				System.out.printf("%10s %5d %5d %5d  %5d %7.2f Excellent\n",
						this.name, this.number1, this.number2, this.number3, sum , avg);
			} else if (avg <= 60) {
				System.out.printf("%10s %5d %5d %5d  %5d %7.2f Fail\n",
						this.name, this.number1, this.number2, this.number3, sum , avg);
			} else {
				System.out.printf("%10s %5d %5d %5d  %5d %7.2f\n",
						this.name, this.number1, this.number2, this.number3, sum , avg);
			}
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}
}
