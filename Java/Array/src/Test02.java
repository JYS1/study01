// 1차원 배열 초기 모양
// 1 2 3 4 5 6 7 8 9 10
// 1차원 배열 내용을 아래와 같이 변경한 후 출력
// 2 1 4 3 6 5 8 7 10 9
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int temp;
		
		for(int i = 0; i < ary.length-1; i++) {
			temp = ary[i+1];
			ary[i+1] = ary[i];
			ary[i] = temp;
			System.out.printf("%3d", ary[i]);
			i++;
			System.out.printf("%3d", ary[i]);
		}
	}

}
