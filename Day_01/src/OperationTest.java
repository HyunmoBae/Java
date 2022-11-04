
public class OperationTest {

	public static void main(String[] args) {
		//사칙연산자(%) 나머지
		int number1 = 10;
		int number2 = 3;
		int result = number1 % number2;
		System.out.println(number1 + "%" + number2+ "=" + result);
		
		//복합연산자(연산후대입연산자)
		int x = 5;
		x += 5;
		//x = x + 5
		System.out.println(" 5 += 5 " + x);

		//논리연산자(짧은연산)
		System.out.println("false && true" + (false && true));
		System.out.println("true || true" + (true || true));
		
		//비트연산자(짧은연산 지원안함)
		System.out.println("false & true" + (false & true));
		System.out.println("true | true" + (true | true));

		
		
	}

}



