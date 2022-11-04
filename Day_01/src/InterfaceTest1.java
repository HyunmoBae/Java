//인터페이스는 특정 그룹(관련이 있는 클래스들)의 사용할 수 있는 메소드들의 명세를 정의한(구현X) 단위
//인터페이스는 객체로 생성할 수 없고, 인터페이스를 구현한 클래스 객체를 통해서 인터페이스에 정의된 기능을 사용해야 함.
interface Interface1{
	int interVar = 10;
	//인터페이스에 변수를 정의하면 자동으로 static final이 지정됨.
	//인터페이스 에서는 변수를 선언할 수 없다.
	
	/*void interfaceMethod1() {
		
	}*/
	//인터페이스에 메소드를 정의하면 자동으로 public abstract가 지정됨.
	//인터페이스에는 일반 메소드를 정의할 수 없다.
	
	void interfaceMetod1();
	
	//void appendMethod();
	//이미 다른 클래스들이 인터페이스를 구현한 상태에서 새로운 기능을 제공할때는 default 메소드를 정의하면 된다.
	public default void defaultMethod() {
		System.out.println("default method");
	}
	
	static void staticMethod() {
		System.out.println("static method");
	}
}

class Interface1Imp1 implements Interface1{
	@Override
	public void interfaceMetod1() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceTest1 {

	public static void main(String[] args) {
		//1.인터페이스는 객체로 만들 수 없다.
		//Interface1 int = new Interface1Imp1();
		
		//2.
		Interface1Imp1 interfaceImp1 = new Interface1Imp1();
		interfaceImp1.interfaceMetod1();
		interfaceImp1.defaultMethod();
		
		Interface1.staticMethod();
	}

}
