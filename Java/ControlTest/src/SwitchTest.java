
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		
		switch (number) {
		case 1 :
		case 2 :
		case 3 : // 숫자가 1~3이면 number1 출력
			System.out.println("number1");
			break; 
			// 여기서 멈추고 싶으면 break를 꼭 넣어라 아니면 밑에꺼도 계속함
		case 10 :
		case 20 :
			System.out.println("number2");
			break;
		
		default: //예외처리
			System.out.println("other number");
		}
	}

}
