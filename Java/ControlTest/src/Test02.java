import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number, 
			evenCount=0, 
			oddCount=0,
			i = 1;
		while (true) {
			System.out.print("¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä ( " + i +" ¹ø¤Š ) : ");
			number = sc.nextInt();
			if(number != 0 ) {
				if(number % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			} else {
				break;
			}
			i++;
		}
		System.out.println("Â¦¼ö °¹¼ö " + evenCount);
		System.out.println("È¦¼ö °¹¼ö " + oddCount);
	}
}