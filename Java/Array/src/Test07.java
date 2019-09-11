
public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = new int[] {5, 3, 1, 4, 2};
		
		for(int i = 0; i < ary.length-1; i++) {
			int n = i;
			for(int j = (i+1); j < ary.length; j++) {
				if(ary[j] < ary[n]) {
					n = j;
				}
			}
			int m = ary[n];
			ary[n] = ary[i];
			ary[i] = m;
			
			System.out.print("Step "+ (i+1) +" ´Ü°è  : ");
			for(int i1 =0; i1 < ary.length; i1++) {
				System.out.print(ary[i1] + " ");
			} System.out.println("");
		}
	}
}
