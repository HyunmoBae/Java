
public class ConversionTest {

	public static void main(String[] args) {
		//1. 변수에 값을 할당
		//1-1. 변수의 데이터타입보다 작은 데이터타입의 상수값을 할당하는 경우
		//할당하는 상수의 데이터 타입이 자동으로 변수의 데이터타입으로 형변환된 후 할당됨
		byte b1 = 127; //1byte
		int i1 = b1; //4byte
		
		//1-1. 변수의 데이터타입보다 작은 데이터타입의 상수값을 할당하는 경우
		//할당하는 상수의 데이터 타입이 자동으로 변수의 데이터타입으로 형변환된 후 할당됨
		//명시적으로 할당하는 값의 데이터 타입을 변수타입으로 형변환한 후 할당해야 함
		//값손실 발생할수있음.
		int i2 = 200;
		byte b2 = (byte)i2;
		System.out.println(b2); //값손실 발생
		
		//1-3. 자바에서 정수타입보다 실수 타입이 표현할 수 있는 범위가 넓기 때문에 정수값을 실수 타입의 변수에 할당할 수는 있어도
		//실수타입의 값을 정수타입의 변수에 할당할 수는 없다.
		long l5 = 20;
		float f1 = l5;
		//long l4 = f1; 불가능

		//2. 연산시 형변한
		//2-1. 기본적으로 보다 큰 피연산자의 데이터타입으로 형변환된 후 연산됨.
		int i3 = 300;
		long l1 = 400;
		long result = i3 + l1;
		System.out.println(result);
		
		float f2 = 100; //4byte
		double d1 = 1.2; //8byte
		double double_result = f2 + d1;
		
		//2-2. int형보다 작은 정수타입(byte, short, char)을 연산하면 무조건 int 타입으로 형변환된 후 연산됨.
		byte b3 = 12;
		byte b4 = 90;
		int result2 = b3 + b4;
		
		char c1 = 'A';
		int a = c1 + 1;
		System.out.println(a);
		
		//1-3. 실수와 정수가 연산되면 무조건 실수타입으로 형변환된다.
		float f3 = 4.1f;
		long l3 = 60;
		float result3 = f3 + l3;
		System.out.println(result3);
		
		//시프트연산자
		//<< : 원래 값에 이동하는 만큼 2의 제곱을 곱하는 결과
		// x * 2 * 2
		
		int x = 2;
		//00000000 00000000 00000000 00000010
		int x_result = x<<2;
		//00000000 00000000 00000000 00001000
		System.out.println("x << 2 : " + x_result);
		
		x = 8;
		int x_result2 = x>>2;
		//00000000 00000000 00000000 00001000
		System.out.println("x << 2 : " + x_result2);
		
		
		//>> : 부호가 있는 비트이동
		//우측 시프트 하면서 비는 영역을 부호비트로 채움
		//>>> : 비부호 비트이동
		//우측 시프트 하면서 비는 영역을 0으로 채움
		
		//증감연산자
		//++, --
		//전치연산자 : 증감연산자가 피연산자 앞에 오는 경우
		
		x = 5;
		int y = ++x;
		System.out.println("x = " + x + ", y = " + y);
		
		//후치연산자 : 증감연산자가 피연산자 뒤에 오는 경우
		//다른연산 먼저 실행하고 증감연산자가 실행됨
		x = 5;
		y = x++;
		System.out.println("x = " + x + ", y = " + y);
		
		//삼항연산자
		//(조건식) ? 조건식이 true일경우 반환할 값 : 조건식이 false 일경우 반환할 값
		//요구사항 : 절대값 구하기
		x = -10;
		int absX = (x >= 0) ? x : -x;
		System.out.println(absX);
		
	}

}












