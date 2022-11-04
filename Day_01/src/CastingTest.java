
public class CastingTest {

	public static void main(String[] args) {
		//지금까지 객체를 참조하는 방식
		President pd = new President();
		
		//참조변수의 타입과 참조하는 레퍼런스의 값의 타입이 다를 때
		//1. 자식클래스 객체의 레퍼런스값을 부모 클래스 타입의 레퍼런스 변수가 할당할때
		//자동으로 자식 클래스 타입의 레퍼런스 값이 부모 클래스 타입으로 캐스팅(UpCasting)되어 할당됨.
		Person person = pd;
		
		//2. 부모클래스 객체의 레퍼런스값을 자식 클래스 타입의 레퍼런스 변수가 할당할때
		//컴파일 오류 발생
		//명시적으로 자식타입으로 캐스팅(DownCasting)해 줘야 한다.
		if(person instanceof President) {
			President pd2 = (President)person;
		}
		else {
			System.out.println("다운컈스팅 불가능");
		}
		
		//자바에서 부모클래스 타입의 레퍼런스 변수가 자식클래스 객체를 참조할 수는 있어도
		//자식클래스 타입의 레퍼런스 변수가 부모클래스 타입의 객체를 참조할 수는 없다.
		Person person2 = new Person();
		if(person2 instanceof President) {
			President president3 = (President) person2; //오류
		}
		else {
			System.out.println("다운캐스팅 불가");
		}
		
		//instanceof 연산자 (다운캐스팅을 할수있는지 없는지 확인하는 연산자)
		//좌측에 있는 레퍼런스값을 우측에 있는 타입으로 다운캐스팅이 가능한지를 판단하는 연산자.
		
		//다운캐스팅을 해야 하는 경우
		//부모클래스에는 정의가 되어있지 않고, 자식클래스에만 정의된 기능을 사용해야 할 때
		Person person3 = new Student();
		//person3.study();
		
		Student student1 = (Student)person3;
		student1.study();
		
		//자바에서 캐스팅관계는 부모자식 클래스에서만 이루어진다.
		//President president4 = (President)(new Employee1());
		
		//변수와 메소드의 참조관계
		//자식클래스에서 부모클래스에 정의한 메소드를 재정의했고 
		//부모클래스 타입의 레퍼런스 변수로 자식객체를 참조하는 경우
		//호출되는 메소드는 항상 자식클래스에서 재정의한 실질적으로는 메모리에 생성된 메소드가 호출됨.
		//즉, 자바에서 메소드의 다형성이 지원된다.
		
		Person person4 = new Student();
		person4.showSleepingStyle();
		person4 = new President();
		person4.showSleepingStyle();
		person4 = new Employee1();
		person4.showSleepingStyle();
		
		//다형성 : 사전적인 의미 : 하나의 대상을 여러형태로 표현할 수 있는 것.
		//자바의 다형성 : 부모 클래스의 기능이 여러 형태의 자식클래스의 기능으로 표현될 수 있다.
		
		//자식클래스에서 부모클래스에 정의한 변수를 재정의했고 
		//부모클래스 타입의 레퍼런스 변수로 자식객체를 참조하는 경우
		//호출되는 변수는 컴파일 타임에 결정됨. 
		//즉, 자바에서 변수의 다형성은 지원하지 않는다.
		Person person5 = new Employee1();
		System.out.println(person5.x); //10 (Person 클래스의 값)
		person5.showSleepingStyle(); //메서드는 Employee1의 것을 실행

		Employee1 employee1 = (Employee1)person5;
		System.out.println(employee1.x); //20
		
	}

}
