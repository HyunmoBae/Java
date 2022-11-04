//런타임 예외
//예외처리를 하지 않아도 컴파일 타임에 오류가 발생하지 않는다.
//주로 개발자의 논리적인 실수로 발생하는 경우가 대부분
//NullPointerException, ArrayIndexOutOfBoundsException, 등

//일반예외
//예외처리를 하지 않으면 컴파일 타임에 오류발생
//해당 예외가 발생할 것이 예상되는 예외발생
//FineNotFoundException, SQLException, 등
public class ExceptionTest3 {
	
	void printData() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		throw new RuntimeException();
	}

}
