import java.util.Iterator;

public class ForTest {

	public static void main(String[] args) {
		//1~10까지 더하기
		int sum = 0;
		String expression = "";
		
		for (int i = 0; i <= 10; i++) {
			//sum = sum + i;
			sum += i;
			expression += (i == 1) ? i : "+" + i; 
		}
		System.out.println(expression + " = " + sum);

		
		System.out.println("1부터 10까지의 짝수의 합");
		sum = 0;
		
		
		for (int i = 0; i <= 10; i++) {
				if(i % 2 == 0) {
				//sum = sum + i;
				sum += i;
				expression += (i == 2) ? i : "+" + i;
			}
		}			
		
		for(int i =2; i<=10; i+=2) {
			sum += i;
			expression += (i == 2) ? i : "+" + i;
		}
		
		System.out.println(expression);
		
		sum = 0;
		expression = "";
		for(int i =10; i >= 1; i--) {
			sum += i;
			expression += (i==10) ? i : "+" +i; 
		}
		System.out.println(expression + "=" + sum);
		
		int x = 1;
		for(;;) {
			if(x>10) {
				break;
			}
			System.err.println("x = " + x);
			x++;
		}
	}
}
