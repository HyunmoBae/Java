import java.util.Scanner;

public class WorkShop2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int number = scanner.nextInt();
		
		System.out.println((number>0) ? "양수" : (number==0) ? 0 : "음수");
		
	}

}
