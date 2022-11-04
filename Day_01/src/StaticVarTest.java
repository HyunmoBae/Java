//요구사항 : 제품을 생산할때 제품마다 중복되지 않는 일련번호를 부여
class Product{
	int serialNumber;
	static int count; //static을 씀으로써 해당클래스에서 생성한 객체를 동일한거 사용
	{
		//초기화블록
		//객체를 생성할때마다 자동으로 반복적으로 실행되는 영역
		
		count++;
		serialNumber = count;
	}
}

public class StaticVarTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println(p1.serialNumber);
		System.out.println(p2.serialNumber);
		System.out.println(p3.serialNumber);
		
		int localVar = 0;
		//로컬변수 (지역변수)
		//초기화시점 : 메소드가 실행될때 메모리할당 받았다가 메소드 실행이 종료되면 메모리 반납
		//변수를 선언할때 값을 할당하지 않으면 컴파일 오류발생.
		//변수를 사용하기 전에 반드시 초기화 해야 함.
		
		int x = 5;
		int y = 6;
		if(x>y) {
			localVar = 100;
		}
		else {
			localVar = 200;
		}
		
		System.out.println(localVar);
	}

}
