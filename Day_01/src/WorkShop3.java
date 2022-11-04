import java.util.Iterator;
import java.util.Scanner;

public class WorkShop3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숮자를 입력하세요 : ");
		//int num = scanner.nextInt();
		//System.out.println(num / 100 * 100);
		
		//다른방법
		String num2 = scanner.next();
		//자릿수 구하기
		int len = num2.length();
		//나누고 곱하는 값 구하기
		int digit = 1;
		
		for( int i = 0; i<len; i++) {
			digit *=10;
		}

		//
		int num3 = Integer.parseInt(num2);
		System.out.println(num3 / (digit * digit));
		
	}
}
