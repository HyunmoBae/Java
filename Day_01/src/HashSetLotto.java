import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 0;set.size()< 6; i++) {
			//size()
			//Collection 인터페이스에 정의됨
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			//자바는 기본타입을 객체 타입에 할당하면 자동으로 객체타입으로 변환된 후(AutoBoxing) 할당됨.
		}
		
		//HashSet은 정렬되지 않는다.
		List<Integer> list = new  LinkedList<Integer>(set); //LinkedList(Collection c)
		Collections.sort(list);
		
		System.out.println(list);
	}
}
	