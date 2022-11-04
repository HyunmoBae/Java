import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0;set.size()< 6; i++) {
			//size()
			//Collection 인터페이스에 정의됨
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			//자바는 기본타입을 객체 타입에 할당하면 자동으로 객체타입으로 변환된 후(AutoBoxing) 할당됨.
		}
		System.out.println(set);
	}

}



