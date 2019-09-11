import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[20];
		int[] count = new int[10];
		int score;
		int a = 0,
			b = 0,
			c = 0;
		
		
		for(int i = 0; i < ary.length; i++) {
			System.out.print(i+1 + " 번째 학생 성적을 입력하세요 : ");
			score = Integer.parseInt( sc.nextLine());
			ary[i] = score;
			
				{switch((int)(ary[i]/10)) {
				case 10:
				case 9: count[i] = a++;
				break;
				case 8: count[i] = b++;
				break;
				}
			}
		}
		for(int i = 0; i< ary.length - 10; i++) {
			System.out.print(i * 10 + "~" + (i * 10 + 9) + " : "+ count[i] + " 명");
			System.out.println();
		}
	}

}
