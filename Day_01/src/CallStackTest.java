//자바에서 메소드를 호출하면 현재 실행되는 메소드가 CallStack의 top 부분의 영역을 확보하고 메소드가 실행됨.
//메소드 실행이 종료되면 스택영역을 반납하고 바로 밑의 영역을 확보하고 있는 메소드가 실행된다.
public class CallStackTest {

	public static void main(String[] args) {
		System.out.println("main start");
		firstMethod();
	}

	private static void firstMethod() {
		System.out.println("first method");
		secondMethod();
		System.out.println("first end");
	}

	private static void secondMethod() {
		System.out.println("second method");
		System.out.println("second end");
	}
	
}
