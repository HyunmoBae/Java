//return : 메소드 실행을 종료하고, 메소드 호출한쪽으로 되돌아 간다는 의미. 
public class ReturnTest {
	void printInfo(String info) {
		if(info.contentEquals("exit")) {
			return;
		}
		System.out.println(info);
	}
	
	//메소드의 리턴타입을 void로 처리하는 방법(경우)은
	//1.return을 사용을 안하는 경우
	void aaa() {
		System.out.println();
	}
	
	//2.return 뒤에 되돌려주는 값을 정의하지 않는 경우
	void bbb() {
		System.out.println();
		return;
	}
	
	double add(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		rt.printInfo("aaa");
		rt.printInfo("bbb");
		rt.printInfo("exit");
		
		double addNumber = rt.add(10, 20);
		System.out.println(addNumber);
		
	}

}
