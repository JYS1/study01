// 1차원 배열 초기 모양
// 1 2 3 4 
// 1차원 배열 내용을 아래와 같이 변경한 후 출력
// 1 2 3 4
// 2 3 4 1
// 3 4 1 2
// 4 1 2 3
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = new int[] {1, 2, 3, 4};
		
		for(int i = 0; i < ary.length; i++) {
			System.out.printf("%3d", ary[i]);
		}
		System.out.println();
		
		for(int i = 1; i < ary.length; i++) {
			System.out.printf("%3d", ary[i]);
		}System.out.printf("%3d", ary[0]);
		
		System.out.println();
		for(int i = 2; i < ary.length; i++) {
			System.out.printf("%3d", ary[i]);
		}for(int i = 2; i < ary.length; i++) {
			System.out.printf("%3d", ary[i-2]);
		}
		
		System.out.println();
		for(int i = 3; i < ary.length; i++) {
			System.out.printf("%3d", ary[i]);
		}for(int i = 0; i < ary.length-1; i++) {
			System.out.printf("%3d", ary[i]);
		}
	}

}
