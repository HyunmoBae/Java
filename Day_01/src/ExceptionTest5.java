//인자를 두개 입력하면 두 인자를 더해서 출력하고
//두개를 입력하지 않으면
//"인자를 잘못 입력했습니다."
//"당신이 입력한 인자수는 ( )개 입니다."

class ArgsException extends Exception{
	public ArgsException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
	private int argsNumber;

	public int getArgsNumber() {
		return argsNumber;
	}

	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}
}

public class ExceptionTest5 {
	
	public static void main(String[] args) {
		try {
			if(args.length != 2) {
				ArgsException ae = new ArgsException("인자를 두개 입력해야 합니다");
				ae.setArgsNumber(args.length);
				throw ae;
			}
			else {
				int number1 = Integer.parseInt(args[0]);
				int number2 = Integer.parseInt(args[1]);
				
				System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
			}
		}
		catch(ArgsException e) {
			System.out.println(e.getMessage());
			System.out.println("당신이 입력한 인자수는 " + e.getArgsNumber() + "개 입니다.");
		}
		
	}

}
