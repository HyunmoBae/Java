class OverridingParent {
	String money = "50원";
	
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild extends OverridingParent{
	int money = 90;
	
	@Override
	void parentMethod() {
		System.out.println("overriding method");
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		OverridingChild over = new OverridingChild();
		over.money = 80;
		System.out.println(over.money);
		over.parentMethod(); //재정의 된 메소드만 인식된다.
	}

}
