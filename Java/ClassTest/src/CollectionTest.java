import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayStr = new ArrayList<>(); // �ڿ� <>�ȿ� ���� ����� ������ 8���� ���ʹ� �����ص� �ȴ�.
		
		arrayStr.add("banana");
		arrayStr.add("apple");
		arrayStr.add("mango");
		
		for(String value : arrayStr) {
			System.out.println(value);
		}
		
		arrayStr.remove(2);
		System.out.println();
		for(int i = 0; i < arrayStr.size(); i++) {
			System.out.println(arrayStr.get(i));
		}
		
		arrayStr.remove(0);
		System.out.println();
		Iterator<String> it = arrayStr.iterator();	// iterator : �ݺ���.
		while(it.hasNext()) {					  	// hasNext() : ����,����,����... (�����Ͱ� ������ ����)
			System.out.println(it.next());		  	// next() : ���� ������ Data
		}
	}
}
