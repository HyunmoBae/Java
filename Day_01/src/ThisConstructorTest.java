//this()

//음료수 클래스를 정의
//음료수 클래스의 속성은 가격(price)과 이름(name)이 있다.
//가격의 기본값은 800원, 이름의 기본값은 물 이다.

//this()를 사용하는 규칙
//1.생성자의 첫번째 실행문으로 사용되어야 함.
//2.recursive는 호출하지않는다.
class Drink{
	int price;
	String name;
	
	//생성자 오버로딩
	public Drink() {
		this(800,"물");
	}
	public Drink(int price) {
		this(price,"물");
	}
	public Drink(String name) {
		this(800,name);
	}
	public Drink(int price, String name) {
		this.name = name;
		this.price = price;
	}
}

public class ThisConstructorTest {

	public static void main(String[] args) {
		
		
	}

}

