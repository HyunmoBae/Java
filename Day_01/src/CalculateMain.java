import java.util.Scanner;

public class CalculateMain {

		//실행
		public static void main(String[] args) {
			Calculate calc = new Calculate();
			int number = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("연산값을 입력하세요 : ");
			number = scanner.nextInt();
			
			
			System.out.println("factorial : " + calc.getFactorial(number));
			System.out.println("power : " + calc.getPower(number));
	}
}