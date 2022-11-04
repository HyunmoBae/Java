
public class FinalVarTest {
	final int x = 0;
	//인스턴스 상수
	//객체마다 상수가 할당됨.
	//따라서, 객체를 생성할때 생성자에서 초기화 함
	//카드 객체를 만들때 마다 각 카드의 번호와 무늬를 인스턴스 상수로 지정할 수 있다.
	
	static final int y = 10;
	//클래스 상수
	//해당 클래스를 사용해서 생성한 모든 객체에서 공유됨.
	//카드 게임에서 카드의 높이와 넓이는 클래스 상수로 지정할 수 있다.
	
	static {
		
	}
	
	public FinalVarTest(int x) {
	}
	
	public static void main(String[] args) {
		FinalVarTest fv1 = new FinalVarTest(10);
		FinalVarTest fv2 = new FinalVarTest(20);
		System.out.println(fv1.x);
		System.out.println(fv2.x);
		
		
		System.out.println(FinalVarTest.y);
		System.out.println(fv1.y);
		System.out.println(fv2.y);
	}

}

