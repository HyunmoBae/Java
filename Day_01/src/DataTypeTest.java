
public class DataTypeTest {

	public static void main(String[] args) {
		// 정수타입(byte, short, int, long)
		byte b1 = 127;
		
		short s = 128;
		//short s = 120;
		//System.out.println("a = " + a);
		
		//동시에 여러 개의 변수 선언
		int i,j,k;
		
		//동시에 여러개의 변수값 초기화하기
		int x=30,y=40,z=50;
		
		//진법
		int num1 = 010; //8진수
		System.out.println(num1);
		int num2 = 0x10; //8진수
		System.out.println(num2);
		int num3 = 0b00110; //2진수
		System.out.println(num3);
		
		//_를 사용해서 자릿수별로 값 할당하기
		//L : long타입의 데이터를 지정하는 접미사
		long longNumber = 1234_233_123_123L;
		System.out.println(longNumber);
		
		//2진수
		int binaryNumber = 0B1111_0000_1010_0000;
		System.out.println(binaryNumber);

		//L이나 l 접미사를 반드시 사용해야 하는 경우
		long l3 = 12000000 * 1000000l;
		System.out.println(l3);
		//자바에서 연산을 할때는 두 피연산자 중 큰 피연산자값으로 모든 피연산자가 형변환한 된후 연산됨.
		//자바에서 정수형의 기본값은 int형임
		
		//문자타입(char) : 문자타입은 반드시 한문자를 저장해야함.
		char han = 'a';
		System.out.println("han = " + han);
		
		char c1 = ' ';
		
		//문자타입에 2바이트 정수를 할당하면 문자코드 값으로 인식함. 
		char english = 0x0041;
		System.out.println(english);
		
		char hangul = 0xac00; //가
		System.out.println(hangul);
			
		char japanese = 0x3055;
		System.out.println(japanese);
		
		//두 문자는 저장할 수 없다.
		//char c2 = 'AB';
		
		//논리값(boolean)
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		//실수타입(float, double)
		//기본타입은 double타입임
		float f1 = 4.1f;
		System.out.println(f1);
		
		//Float 타입의 접미사는 소문자 : f, F
		//double 타입의 접미사는 d, D
		
		//반드시 접미사를 지정하는 경우
		
		double avg = 242d / 3;
		System.out.println(avg);
		
		//자바에서는 실수타입이 정수타입보다 표현할 수 있는 범위가 넓다.
//		long l1 = 10000000000000000;
		double l5 = 1000000000000000000000000000000000000000000000000000000000d;
		
		

		
		
	}

}