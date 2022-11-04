//A라는 추상클래스를 B라는 추상클래스가 상속하고
//B라는 추상클래스를 C라는 추상클래스가 상속하면
//C 추상클래스를 상속하는 클래스는 A,B,C 추상클래스에 정의된 모든 추상메소드를 다 구현해야 한다.

abstract class AbstractClass1{
	abstract void abstractMethod1();
}

abstract class AbstractClass2 extends AbstractClass1{
	abstract void abstractMethod2();
}

class GeneralClass extends AbstractClass2{
	@Override
	void abstractMethod1() {
		System.out.println("asd");
	}
	@Override
	void abstractMethod2() {
		System.out.println("asdf");
	}
}

public class AbstractTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralClass gc = new GeneralClass();
		gc.abstractMethod1();
		gc.abstractMethod2();
	}

}
