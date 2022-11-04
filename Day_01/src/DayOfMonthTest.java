import java.util.Scanner;

public class DayOfMonthTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요 : ");
		int year = scanner.nextInt();
				
		System.out.println("월별을 입력하세요 : ");
		int month = scanner.nextInt();		
		int day = 0;
		boolean monthRight = true;
		
		switch(month) {
			case 1,3,5,7,8,10,12:
				day = 31;
				break;
			case 2:
				boolean leapyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
				if (leapyear) {
					day = 29;
				}
				else {
					day = 28;
				}
				break;
			case 4,6,9,11:
				day = 30;
				break;
			default:
				monthRight = false;
		}
		
		if(monthRight) {
			System.out.println(year + "년 " + month + "월은 총 "+day + "일까지 존재합니다.");
		}
		else {
			System.out.println("달값이 잘못 되었습니다.");
		}
	}
}
