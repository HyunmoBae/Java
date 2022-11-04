import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator(); //Collection 인터페이스에서 제공하는 메소드.
		//Iterator 객체들 반환
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
	}

}
