
public class ExceptionTest2 {
	public void exceptionMethod(String[] args) {
		try {
		int number = Integer.parseInt(args[0]);
		int result = 10 / number; //예외발생
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("인자를 전달하세요");
		return;
	}
	catch(NumberFormatException e) {
		System.out.println("정수를 입력하세요");
		return;
	}
	catch(ArithmeticException e) {
		System.out.println("0으로 나누면 안됩니다.");
	}
	finally {
		System.out.println("반드시 실행");
	}
	
}
	
	public static void main(String[] args) {
		ExceptionTest2 et2 = new ExceptionTest2();
		et2.exceptionMethod(args);
	}

}
