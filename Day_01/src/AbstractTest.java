//추상클래스는 객체로 생성할수가 없다.
//추상클래스에 정의된 메소드들은 자식클래스에서 추상클래스의 메소드들을 구현한 후 자식클래스 객체를 통해서 사용해야 한다.
//자식클래스에는 기능이 반드시 있어야하는데 각 자식클래스에서의 기능이 너무달라서 일괄적으로 부모클래스에서 정의할 수 없을때 사용.

abstract class AbstractClass{
	//일반변수
	int age;

	//일반메소드
	void generalMethod() {
		System.out.println("general method");
	}
	//정의부만 있고 구현부가 없는 메소드
	//추상메소드 : abstract 예약어가 지정되어있어야 한다.
	//추상메소드가 하나라도 있는 클래스는 추상클래스여야 한다.
	abstract void abstractMethod();
}

class AbstractClassChild extends AbstractClass{
	@Override
	void abstractMethod() {
		System.out.println("abstract method 구현");
	}
}

public class AbstractTest {
	
	public static void main(String[] args) {
		//1.
		//AbstractClass ab = new AbstractClass()
		
		//2.
		AbstractClassChild ab = new AbstractClassChild();
		ab.abstractMethod();
		ab.generalMethod();
	}

}
