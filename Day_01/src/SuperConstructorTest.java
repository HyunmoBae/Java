//부모가 없는 자식은 없다.
//자바에서도 부모객체가 없는 자식객체는 존재할 수 없다.
//자바에서 자식클래스의 생성자를 호출하면 자동으로 부모클래스의 빈생성자를 호출해서 부모객체 먼저 만들고 자식객체가 만들어진다.

//자바에서 생성자를 하나도 정의하지 않으면 인자없는 생성자가 자동으로 생성되지만, 
//인자 있는 생성자가 하나라도 정의되면 빈 생성자가 자동으로 생성되지 않는다.
//이런 경우에는 super()를 사용해서 부모클래스의 인자있는 생성자를 명시적으로 호출해야 함.

class Base{
	int x;
	
	public Base(int x) {
		System.out.println("base constructor");
	}
	/*public Base() {
		System.out.println("base constructor");
	}*/
}

class Derived extends Base{
	public Derived() {
		super(10);
		System.out.println("Derived constructor");
	}
}

public class SuperConstructorTest {

	public static void main(String[] args) {
		Derived dri = new Derived();
		
	}

}
