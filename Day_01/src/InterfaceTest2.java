//자바에서 클래스들 끼리는 다중상속을 지원하지 않는다. (interface가 있는이유)
//상속구조의 모호성이 발생할 우려가 있기때문이다.
//그러나, 인터페이스는 다중상속을 지원한다.
//상속구조의 모호성이 발생할 우려가 없기 때문이다.

interface Inter1{
	//static 변수는 상속되는게 아님
	//Inter1
	int x = 1;
	void in1Method();
}

interface Inter2{
	int x = 20;
	void in1Method();
	void in2Method();
}

interface Inter3 extends Inter1,Inter2{
	
}

class Inter3Imp1 implements Inter3{
	@Override
	public void in1Method() {
		System.out.println("in1Method");
	}
	@Override
	public void in2Method() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		
	}

}
