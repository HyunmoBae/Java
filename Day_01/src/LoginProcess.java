import java.util.Scanner;

public class LoginProcess {

	public static void main(String[] args) {
		//1. 데이터베이스에 저장되어 있다고 가정하는 아이디와 비밀번호
		/*String dbId = "java";
		String dbPass = "1234";
		
		//2.입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String inputId = scanner.next();
		System.out.println("비밀번호를 입력하세요 : ");
		String inputPass = scanner.next();
				
		int loginResult;
		
		if(!dbId.contentEquals(inputId)) {
			loginResult = 1;
		}
		else if(!dbPass.contentEquals(inputPass)){
			loginResult = 2;
		}
		else {
			loginResult = 3;
		}
		
		if(loginResult == 1) {
			System.out.println("아이디가 틀렸습니다.");
		}
		else if(loginResult == 2) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else {
			System.out.println("로그인 성공");
		}*/
		
		//4. 중첩 if문
		//if문 안에 if문이 오는 문장
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		String grade = "";
		if(score >= 90) {
			grade = "A";
			if(score >=95) {
				grade = "A+";
			}
		}
		else if(score >= 80) {
			grade = "B";
			if(score >=85) {
				grade="B+";
			}
		}

		System.out.println("학점 : " + grade);
		
	}

}
