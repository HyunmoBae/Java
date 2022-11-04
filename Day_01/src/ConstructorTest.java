//생성자
//객체를 생성할때 new 연산자에 의해서 단 한번 호출되는 단위
//자바에서 클래스의 생성자를 하나도 정의하지 않으면 빈 생성자를 자동으로 생성해 줌
//만약, 클래스 내에 인자 있는 생성자가 하나라도 정의되면 빈생성자를 만들어주지 않는다.
//따라서, 인자 있는 생성자와 빈 생성자를 동시에 사용하려면 빈 생성자도 명시적으로 정의해야 한다.

//생성자 규칙
//1.생성자의 이름은 클래스의 이름과 동일해야 한다.
//2.생성자는 리턴타입이 없어야 한다.
//3.생성자의 접근제한자는 클래스의 접근제한자와 동일할 필요는 없다.
class Data1 {
	int value;
	public Data1(int x) {
		value = x;
	}
	public Data1() {
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 date = new Data1();
	}

}
