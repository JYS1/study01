import java.util.Scanner;

// 10명 학생의 점수를 입력받아 평균을 계산하고 점수와 평균과의 차를 출력하는 프로그램

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		int number1, number2, number3, number4, 
		number5, number6, number7, number8, number9, number10;
		int sum, avg, i=0;
		double avg1, avg2, avg3, avg4, avg5, avg6, avg7, avg8, avg9, avg10;
		
		System.out.print( ++i + "번쨰 학생 점수 입력 : ");
		number1 = sc.nextInt();
		System.out.print(++i + "번쨰 학생 점수 입력 : ");
		number2 = sc.nextInt();
		System.out.print(++i + "번쨰 학생 점수 입력 : ");
		number3 = sc.nextInt();
		System.out.print(++i + "번쨰 학생 점수 입력 : ");
		number4 = sc.nextInt();
		System.out.print(++i + "번쨰 학생 점수 입력 : ");
		number5 = sc.nextInt();
		System.out.print(++i + "번쨰 학생 점수 입력 : ");
		number6 = sc.nextInt();
		System.out.print(++i + "번쨰 학생 점수 입력 : ");
		number7 = sc.nextInt();
		System.out.print(++i + "번쨰 학생 점수 입력 : ");
		number8 = sc.nextInt();
		System.out.print(++i + "번쨰 학생 점수 입력 : ");
		number9 = sc.nextInt();
		System.out.print(++i + "번쨰 학생 점수 입력 : ");
		number10 = sc.nextInt();
		
		sum = (number1 + number2+ number3 +number4+ number5 
				+number6 +number7+ number8+ number9 +number10);
		avg = sum / 10;
		avg1 = number1 - avg;
		avg2 = number2 - avg;
		avg3 = number3 - avg;
		avg4 = number4 - avg;
		avg5 = number5 - avg;
		avg6 = number6 - avg;
		avg7 = number7 - avg;
		avg8 = number8 - avg;
		avg9 = number9 - avg;
		avg10 = number10 - avg;
		
	
		System.out.println("평균 [ "+ avg +" ] 과   1 번 학생 점수 [ "+ number1 + " ]의 차이 [ " + avg1 + " ]" );
		System.out.println("평균 [ "+ avg +" ] 과   2 번 학생 점수 [ "+ number2 + " ]의 차이 [ " + avg2 + " ]" );
		System.out.println("평균 [ "+ avg +" ] 과   3 번 학생 점수 [ "+ number3 + " ]의 차이 [ " + avg3 + " ]" );
		System.out.println("평균 [ "+ avg +" ] 과   4 번 학생 점수 [ "+ number4 + " ]의 차이 [ " + avg4 + " ]" );
		System.out.println("평균 [ "+ avg +" ] 과   5 번 학생 점수 [ "+ number5 + " ]의 차이 [ " + avg5 + " ]" );
		System.out.println("평균 [ "+ avg +" ] 과   6 번 학생 점수 [ "+ number6 + " ]의 차이 [ " + avg6 + " ]" );
		System.out.println("평균 [ "+ avg +" ] 과   7 번 학생 점수 [ "+ number7 + " ]의 차이 [ " + avg7 + " ]" );
		System.out.println("평균 [ "+ avg +" ] 과   8 번 학생 점수 [ "+ number8 + " ]의 차이 [ " + avg8 + " ]" );
		System.out.println("평균 [ "+ avg +" ] 과   9 번 학생 점수 [ "+ number9 + " ]의 차이 [ " + avg9 + " ]" );
		System.out.println("평균 [ "+ avg +" ] 과 10 번 학생 점수 [ "+ number10 + " ]의 차이 [ " + avg10 + " ]" );
		
		
	}

}
