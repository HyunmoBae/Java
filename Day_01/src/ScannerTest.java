//자바 클래스에서 자신 클래스와 다른 퍀지ㅣ에서 존재하는 클래스를 사용할때는 반드시 import를 해줘야 한다.
//java.lang 패키지에 있는 클래스들은 자동 임포트됨.
import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	//문자열 읽기
	//String : 자바에서 문자열을 다루는 클래스
	System.out.println("이름 : ");
	String name = scanner.next();
	System.out.println("name = " + name);
	
	//점수 읽기
	System.out.println("나이 : ");
	int age = scanner.nextInt();
	System.out.println("age = " + age);
	
	}

}
