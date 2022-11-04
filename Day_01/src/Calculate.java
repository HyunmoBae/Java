import java.util.Scanner;

public class Calculate {
	int num;
	
	//1번.
	int getFactorial(int num) {
	int result = 1;
	if(num >= 2) {
		for(int i = num; num >= 1; num--) {
			result *= num;
		}
	}
	return result;
	}
	
	//2번.
	int getPower(int num) {
		int result = 1;
		
		for(int i = 1; i <= num; i++ ) {
			result += i * i;
		}
		return result; 
	}
	
	

}

