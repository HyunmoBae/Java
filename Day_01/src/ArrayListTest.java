import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		//C(Create)
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		//R(Read)
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//삽입
		list.add(1, "삽입");
		System.out.println("list.add(1, \"삽입1\")");
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<String> appendList = new ArrayList<>();
		appendList.add("test1");
		appendList.add("test2");
		appendList.add("test3");
		
		list.addAll(appendList);
		System.out.println("list.addAll(appendList)");
		
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<String> insertList = new ArrayList<>();
		insertList.add("insert1");
		insertList.add("insert2");
		insertList.add("insert3");
		
		list.addAll(1,insertList);
		System.out.println("list.addAll(1,insertList)");
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		//U(Update)
		list.set(0, "수정데이터");
		System.out.println("list.set(0, \"수정데이터\")");
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//D(Delete)
		list.remove(1);
		System.out.println("list.remove(1)");
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}		
		
		list.remove("insert2");
		System.out.println("list.remove(insert2)");
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}


