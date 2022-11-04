
public class Student extends Person{
	String school;
	int grade;
	
	@Override
	void showSleepingStyle() {
		System.out.println("학생들은 잘 잡니다.");
	}
	
	//부모클래스에 정의되지 않은 메소드
	public void study() {
		System.out.println("공부를 한다.");
	}
}
