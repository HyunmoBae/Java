
public class InitialBlockTest {
	static {
		//static 초기화블록
		//클래스를 로딩할때 단한번 실행되는 영역
		//DB연동할때 드라이버를 주로 로딩함.
		//main 메소드보다 먼저 실행됨.
		System.out.println("static{}");
	}
	{
		//instance 초기화블록
		//객체를 생성할때마다 공통적으로 수행해야 하는 작업을 정의함
		System.out.println("{}");
	}
	public InitialBlockTest() {
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		InitialBlockTest it1 = new InitialBlockTest();
		InitialBlockTest it2 = new InitialBlockTest();
	}

}
