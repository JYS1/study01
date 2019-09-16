
public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		
		System.out.println(a + " + " + b + " = " + result);
		
		String text1 = "Hello";
		String text2 = "Hello";
		// reference 값 비교 /  별로 좋은 방법은 아님.
		if( text1 == text2) {
			System.out.println(text1 + " == " + text2);	
		} else {
			System.out.println(text1 + " != " + text2);
		}
		// ▼ 가 더 좋은 방법.
		if( text1.equals(text2)) {
			System.out.println(text1 + " == " + text2);	
		} else {
			System.out.println(text1 + " != " + text2);
		}
	}
	public static int sum(int a, int b) {
		int result = a + b;
		
		return result;
	}
}
