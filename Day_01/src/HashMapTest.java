import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		String[] cityArray = {"서울","대전","대구","부산","춘천","하양"};
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		for (int i = 0; i < cityArray.length; i++) {
			hashMap.put(i, cityArray[i]);
		}
		
		//맵에 있는 키값들을 Set 타입으로 얻어옴
		Set<Integer> keySet = hashMap.keySet();
		for(Integer key : keySet) {
			System.out.println(hashMap.get(key));
		}
	}
}
