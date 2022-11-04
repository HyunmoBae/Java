import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Account mywallet = new Account();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("메뉴 입력 : ");
		System.out.println("1.입금");
		System.out.println("2.출금");
		System.out.println("3.잔액조회");
		System.out.println("4.프로그램 종료");
		int number = scanner.nextInt();
		
		
		if(number == 1) {
			System.out.println("입금 금액을 입력하세요 : ");
			int cost = scanner.nextInt(); 
			mywallet.deposit(cost);
		}
		else if(number == 2) {
			System.out.println("출금 금액을 입력하세요 : ");
			int cost = scanner.nextInt();
			mywallet.withdraw(cost);
		}
		else if(number == 3) {
			mywallet.showBalance();
		}
		else {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
	}
	}

}
