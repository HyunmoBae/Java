import java.util.Scanner;

public class WorkShop4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자 입력");
		char c = scanner.next().charAt(0);
		
		boolean b = c >= 'A' && c <='Z' || c>= 'a' && c<='z' || c>='0' && c<='9';
		System.out.println(b);
		
	}

}
