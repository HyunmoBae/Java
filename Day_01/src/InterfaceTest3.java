//비행기 구현
//운송수단, 나는기능

class Vehicle1{
	void trasfer() {
		System.out.println("운반한다.");
	}
}

interface Flyable{
	void fly();
}

class Plane1 extends Vehicle1 implements Flyable{
	@Override
	public void fly() {
		
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
