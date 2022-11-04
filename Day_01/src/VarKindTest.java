//자바는 "영역({})"으로 묶인 곳에서는 어디서든지 변수 선언할 수 있다.
//변수가 선언된 영역에 따라서 변수종류가 결정됨.
public class VarKindTest {
	int memberVar;
	//멤버변수(인스턴스변수)
	//2. 초기화 시점 : new 연산자에 의해서 객체를 생성할 때 객체마다 초기화 됨.
	//1. 변수를 선언할 때 값을 할당하지 않으면 자동으로 변수의 데이터타입의 기본값으로 할당됨.

	static int staticVar;
	//스테틱변수(클래스변수)
	//초기화 시점 : JVM이 해당 클래스를 로딩할때 클래스 영역의 static 영역에 바로 초기화됨
	//3.따라서, 객체를 생성하지 않아도 사용할 수 있다. 
	//4.해당 클래스를 사용해서 생성된 모든 객체에서 공유됨. 

	void method1(int paramVar1, int paramVar2) {
		//파라미터 변수 : 메소드를 호출할때 전달하는 값을 저장하는 변수
		//특성은 로컬변수와 같다.
	}
	
	//자바에서 사용하는 메소드 종류
	//1.멤버메소드(인스턴스메소드)
	//5. 클래스 객체를 생성한 후 사용가능.
	void instanceMethod1() {
		int x = staticVar;
		x = memberVar;
		instanceMethod2();
		staticMethod1();
	}
	void instanceMethod2() {
		
	}
	
	//2. static 메소드(클래스메소드)
	//6. 객체를 생성하지 않아도 클래스이름으로 바로 사용 가능
	static void staticMethod1() {
		VarKindTest vt1 = new VarKindTest();
		int x = vt1.memberVar;
		
		x = staticVar;
	}
	static void staticMethod2() {
		
	}
	
	public static void main(String[] args) {
		//1. 
		VarKindTest vt1 = new VarKindTest();
		System.out.println("vt1.memberVar = " + vt1.memberVar);//0
		
		//2.
		VarKindTest vt2 = new VarKindTest();
		vt1.memberVar = 100;
		System.out.println("vt1.memberVar = " + vt1.memberVar);
		System.out.println("vt2.memberVar = " + vt2.memberVar);
		
		//3.
		System.out.println("VarKindTest.staticVar = " + VarKindTest.staticVar);
		
		//4.
		VarKindTest.staticVar =  100;
		System.out.println("VarKindTest.staticVar = " + VarKindTest.staticVar);		
		System.out.println("vt1.staticVar = " + vt1.staticVar);		
		System.out.println("vt2.staticVar = " + vt2.staticVar);
		
		//5.
		//VarKindTest.instanceMethod1();
		vt2.instanceMethod1();
		
		//6.
		VarKindTest.staticMethod1();
		
	}
}
