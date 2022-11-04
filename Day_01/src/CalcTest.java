import java.util.Scanner;

public class CalcTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int Num1 = scanner.nextInt();
		System.out.println("연산자를 선택하세요(+|-|*|/ : ");
		String Operator = scanner.next();
		
		System.out.println("두번째 숫자를 입력하세요 : ");
		int Num2 = scanner.nextInt();
			
		int Result = 0;
		boolean rightOperator = true;
		
		switch(Operator) {
		case "+":
			Result = Num1 + Num2;
			System.out.println(Result);
			break;
		case "-":
			Result = Num1 - Num2;
			System.out.println(Result);
			break;
		case "*":
			Result = Num1 * Num2;
			System.out.println(Result);
			break;
		case "/":
			Result = Num1 / Num2;
			System.out.println(Result);
			break;
		default:
			rightOperator = false;
			break;
		
			
		}
		//3.출력
		if(rightOperator) {
			System.out.println(Num1 + " " + Operator + " " + Num2 + " = " + Result);
		}
		else {
			System.out.println("입력이 올바르지 않습니다.");
		}
		
	}
	
}
















