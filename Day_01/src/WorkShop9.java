import java.util.Scanner;

public class WorkShop9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번.
		Scanner scanner = new Scanner(System.in);
		System.out.println("중간점수를 입력하세요!");
		int middle = scanner.nextInt();
		System.out.println("기말점수를 입력하세요!");
		int last = scanner.nextInt();
		System.out.println("레포트점수를 입력하세요!");
		int report = scanner.nextInt();
		System.out.println("출석점수를 입력하세요!");
		int check = scanner.nextInt();
		
		double score = ((middle+last) / 2)*0.6 + report * 0.2 + check * 0.2 ;
		System.out.printf("성적 : %.2f",score);
		System.out.println();
		
		//2번.
		String grade = "";
		if(score >=90) {
			grade = "A";
			System.out.println("학점 : "+ grade);
		}
		else if(score >= 80) {
			grade = "B";
			System.out.println("학점 : "+ grade);
		}
		else if(score >= 70) {
			grade = "C";
			System.out.println("학점 : "+ grade);
		}
		else if(score >= 60) {
			grade = "D";
			System.out.println("학점 : "+ grade);
		}
		else {
			grade = "F";
			System.out.println("학점 : "+ grade);
		}
		
		String graderesult = "";
		switch(grade) {
		case "A","B":
			graderesult = "excellent";
			System.out.println("평가 : " + graderesult);
			break;
		case "C","D":
			graderesult = "good";
			System.out.println("평가 : " + graderesult);
			break;
		default:
			graderesult = "poor";
			System.out.println("평가 : " + graderesult);
			
	}
	}
}
