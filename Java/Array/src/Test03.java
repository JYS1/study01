// 1차원 배열 초기 모양
// 1 2 3 4 5 6 7 8 9 10
// 1차원 배열 내용을 아래와 같이 변경한 후 출력
// 6 7 8 9 10 1 2 3 4 5
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < (ary.length)/2; i++) {
			System.out.printf("%3d", ary[i+5]);
		}
		for(int i = 0; i < (ary.length)/2; i++) {
			System.out.printf("%3d", ary[i]);
		}
	}

}
