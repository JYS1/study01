import java.util.Scanner;

//10개의 정수를 입력 받아 1차원 배열에 저장 한 후 0이 입력될 때까지 정수를 입력받아
//10개의 정수를 저장하고 있는 1차원 배열에서 검색을 수행하여 찾았으면 해당 data의
//index를 출력하고 검색을 실패하면 에러 메시지 출력하는 프로그램 (linear search algorithm)
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int number = 10;
		int number1 = 1, number2 = 0; // number1입력,number2 찾는숫자.
		int result = 0;
		int count = 0;
		int[] ary = new int[number];
		
		
		while ( number1 != 0 ) { 
			System.out.print(count+1 + " Input number : " );
			number1 = Integer.parseInt( sc.nextLine());
				ary[count] = number1;
				count++;
				if(count == 10) {
					number1 = 0;
				}
		}
		if (number1 == 0) {
			System.out.print( "찾을 숫자를 입력하세요 : " );
		
		number2 = Integer.parseInt( sc.nextLine() );
		for (int j = 0; j < ary.length; j++) {
			if(ary[j] == number2) {
				result = j;
				break;
			} else {
				result = -1;
				}
			}
		
		if(result == -1) {
			System.out.println("Error : 찾을 수 없습니다.");
		} else {
			System.out.println(number2 + " 은 ary [ " +
						(result+1) +" ]에 있습니다. ");
			}
		}
	}
	
}



