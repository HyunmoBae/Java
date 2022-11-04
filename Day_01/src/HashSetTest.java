import java.util.HashSet;
//배열은 기본데이터 타입과 객체 타입을 모두 저장할 수 있지만
//컬렉션은 객체 타입만 저장할 수 있다.
//배열은 크기가 한번 정해지면 변경불가 하지만
//컬렉션은 크기가 자동으로 변경됨.

import static java.lang.System.out;
public class HashSetTest {
	
	public static void main(String[] args) {
		String[] nationArray = {"한국","북한","영국","캐나다","일본"};
		
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		
		for(String nation : nationArray) {
			if(!hs1.add(nation)) {
				//boolean add : Collection 인터페이스에서 제공
				////요소 추가가 성공하면 true반환
				hs2.add(nation);
			}
		}
		
		out.println("hs1 : " + hs1);
		out.println("hs2 : " + hs2);
		
		hs1.removeAll(hs2);
		out.println("hs1 : " + hs1);
		out.println("hs2 : " + hs2);
	}

}

