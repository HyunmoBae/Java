import java.util.ArrayList;
import java.util.ListIterator;

//Iterator는 전방향 작업만 가능
//ListIterator는 전방향 후방향 이동 가능
public class ListIteratorTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator();
		
		//전방향
		while(it.hasNext()) {
			//다음 요소가 있는지 판단하는 메소드
			System.out.println(it.next());
		}
		System.out.println();
	
	//후방향
	while(it.hasPrevious()) {
		System.out.println(it.previous());
	}

	}
}
