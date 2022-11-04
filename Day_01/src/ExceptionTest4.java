
public class ExceptionTest4 {
	public void exceptionMethod() throws Exception {
		throw new Exception();
	}
	
	public static void main(String[] args) {
		ExceptionTest4 et4 = new ExceptionTest4();
		try {
			et4.exceptionMethod();
		} catch (Exception e) {
			System.out.println("오류발생");
		}
	}

}
