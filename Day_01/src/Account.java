
public class Account {
	int balance;
	
	void deposit(int cost) {
		balance += cost;
	}
	
	void withdraw(int cost) {
		if(balance < cost ) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
		balance -= cost;
		}
	}
	
	void showBalance() {
		System.out.println("현재 잔액은 "+ balance +"원입니다.");
	}
}
