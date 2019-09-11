
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1���� �迭
		int[] ary = new int[5]; // ���ο� �迭 ����.5��¥�� �迭
		 ary[0] = 10;
		 ary[1] = 20;
		 ary[4] = 40;
		 //length : �迭�� ��ü ���� ����.
		 for(int i = 0; i < ary.length; i++) {
			 System.out.println(ary[i]);
		 }
		 double[] dary = new double[] 
				 {10.5, 20.9, 5.5, 7.6, 8.6};
		 for(int i = 0; i < dary.length; i++) {
			 System.out.println(dary[i]);
		 }
		 //��Ȯ�� for�� : �迭 ��ü�� ��� �Ѵ�./ �κп��X
		 System.out.println();
		 for (double value : dary) {
			 System.out.printf("%8.2f", value);
		 }
		 System.out.println();
		 
		 //2���� �迭
		 int[][] ary2 = new int[][] { {10,11,12,13,14},
				 					   {20,21,22,23,24}
		 							 };
		 for(int i = 0; i < ary2.length; i++) {
			 for(int j = 0; j < ary2[0].length; j++) {
				 System.out.printf("%3d", ary2[i][j]);
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 for ( int[] row : ary2) {
			 for(int column : row) {
				 System.out.printf("%3d", column);
			 }
			 System.out.println();
		 }
		 
		 //3���� �迭 : 2���� �迭 2��.
		 System.out.println();
		 int [][][] ary3 = new int[][][] {{{1,2},{3,4}},
			 							  {{10,20},{30,40}}
		 							  };
		 for(int i = 0; i < ary3.length; i++) {
			 for(int j = 0; j < ary3[0].length; j++) {
				 for(int k = 0; k < ary3[0][0].length; k++) {
					 System.out.printf("%4d", ary3[i][j][k]);
				 }
				 System.out.println();
			 }
			 System.out.println();
		 }
		 System.out.println();
		 int [] a1 = new int[] {1,2,3};
		 int [] a2 = new int[] {10,20,30,40,50};
		 int [] a3 = new int[] {100,200,30,400};
		 int [][] a4 = new int[][] {a1,a2,a3};
		 
		 for(int i = 0; i < a4.length; i++) {
			 for(int j = 0; j < a4[i].length; j++) {
				 System.out.printf("%5d", a4[i][j]);
			 }
			 System.out.println();
		 }
		// a5 �� ���� ���� : a1�� �ٲ�.
		 int [] a5 = a1;
		 System.out.println();
		 for(int value : a5) {
			 System.out.printf("%5d", value);
		 }
		
		 a5[0] = 1000;
		 System.out.println();
		 for(int value : a1) {
			 System.out.printf("%5d", value);
		 }
		 System.out.println();
		 int [] a6 = new int [a1.length];
		 for(int i = 0; i < a1.length; i++) {
			 a6[i] = a1[i];
			 System.out.printf("%5d", a6[i]);
		 }
		 // a6 �� ���� ���� : ���ο� �迭�� ���� ������.
		 a6[0] = 10000;
		 System.out.println();
		 for(int value : a6) {
			 System.out.printf("%5d", value);
		 }
		 
		 System.out.println();
		 for(int value : a6) {
			 System.out.printf("%5d", value);
		 }
	}
}
