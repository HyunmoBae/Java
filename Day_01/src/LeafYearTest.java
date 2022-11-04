import java.util.Scanner;

public class LeafYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도 : ");
		int year = scanner.nextInt();
		
		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		if (leapYear) {
			System.out.println(year + "년은 윤년입니다.");
		}
		else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		
		
		
	}

}
