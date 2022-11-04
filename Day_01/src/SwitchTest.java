import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("====회원관리====");
		System.out.println("1.회원등록");
		System.out.println("2.회원목록보기");
		System.out.println("3.회원정보수정");
		System.out.println("4.회원정보삭제");
		
		System.out.println("메뉴번호 : ");
		int menuNumber = scanner.nextInt();

		switch (menuNumber) {
		case 1: 
			System.out.println("회원등록완료");
			break;
		case 2:
			System.out.println("목록보기");
			break;
		case 3:
			System.out.println("정보수정");
			break;
		case 4:
			System.out.println("정보삭제");
			break;
		default:
			System.out.println("메뉴번호가 잘못되었습니다");
			break;
		}
		
	}

}
