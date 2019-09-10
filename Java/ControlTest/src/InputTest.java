import java.util.*;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int number;
		String str;
		// 숫자 입력후 문자 입력하면 버퍼가 남아서 문자를 입력 못함.
		System.out.print("Input number : ");
		//number = sc.nextInt();
		//sc.nextLine(); 방법1
		number = Integer.parseInt(sc.nextLine()); 
		//방법2 : 문자열로 받아 정수로 변환.
		System.out.print("Input String : ");
		str = sc.nextLine();
		
		System.out.println("number => " + number);
		System.out.println("str => "+ str);
	}

}
