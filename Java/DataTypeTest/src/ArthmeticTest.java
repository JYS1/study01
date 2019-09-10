import java.util.Scanner;

public class ArthmeticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1, number2;
		System.out.print("input number1 : ");
		number1 = sc.nextInt();
		System.out.print("input number2 : ");
		number2 = sc.nextInt();
		
		int resultAdd, resultSub, resultMultiple, resultDivide, resultRemaind;
		resultAdd = number1 + number2;
		resultSub = number1 - number2;
		resultMultiple = number1 * number2;
		resultDivide = number1 / number2;
		resultRemaind = number1 % number2;  // 나머지 연산
		
		System.out.println( number1 + " + " + number2 +" = " + resultAdd);
		System.out.println( number1 + " - " + number2 +" = " + resultSub);
		System.out.println( number1 + " * " + number2 +" = " + resultMultiple);
		System.out.println( number1 + " / " + number2 +" = " + resultDivide);
		System.out.println( number1 + " % " + number2 +" = " + resultRemaind);
		
		System.out.println(5 / 2);
		System.out.println(5 / 2.0); 		// 묵시적 형변환
		System.out.println(5 / (double)2);	// 암(명)시적 형변환( cast 연산자 )
		
		number1 = number1 + 1;
		System.out.println("number1 = " + number1);
		number1 = ++number1 + 1;
		System.out.println("number1 = " + number1);
		
		System.out.println(number1 + " > " + number2 + " -> " + (number1 > number2));
		System.out.println( resultAdd > 50 || resultSub < 50);
		
		
	}

}
