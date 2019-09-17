import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayStr = new ArrayList<>(); // 뒤에 <>안에 정의 해줘야 하지만 8버전 부터는 생략해도 된다.
		
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
		Iterator<String> it = arrayStr.iterator();	// iterator : 반복자.
		while(it.hasNext()) {					  	// hasNext() : 다음,다음,다음... (데이터가 없을떄 까지)
			System.out.println(it.next());		  	// next() : 현재 시점의 Data
		}
	}
}
