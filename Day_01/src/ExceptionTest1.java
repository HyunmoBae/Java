
public class ExceptionTest1 {

	public static void main(String[] args) {
		System.out.println("상단 실행");
		try {
		int number = Integer.parseInt(args[0]);
		//실행할때 인자를 하나도 전달하지 않으면 ArrayIndexOutofBoundsException 발생
		//인자를 정수가 아닌 문자열 형태값을 전달하면 NumberForamtException 발생
		//인자를 0값을 전달하면 NumberFormatException 발생
		int result = 10 / number; //예외발생
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 전달하세요");
		}
		catch(NumberFormatException e) {
			System.out.println("정수를 입력하세요");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다.");
		}
		catch(Exception e) {
			System.out.println("오류남");
		}
		
		System.out.println("하단 실행");
	}
}

