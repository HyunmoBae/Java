import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단순 if문
		//조건문이 true를 반환하면 명령문을 실행하고
		//조건문이 false를 반환하면 명령문을 실행하지 않는 문장
		
		//if(조건문){
		//실행문;
		//}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		
		//실행문이 하나일땐 {}생략가능
		/*if(number > 10) {
			System.out.println("숫자가 10보다 큽니다~");
		}*/
		
		//2. 조건식에 만족하지 않을 경우 실행할 명령문도 지정하는 if문
		//if ~ else
		
		if(number > 10) {
			System.out.println("숫자가 10보다 큽니다~");
		}
		else if(number > 5){
			System.out.println("숫자가 6~10입니다~");
		}
		else {
			System.out.println("숫자가 5보다 작습니다~");
		}
		
		
	}	

}
