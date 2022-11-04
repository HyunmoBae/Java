//요구사항 추가
//만약 인자로 학생객체가 전달되었으면 study() 메소드를 호출해라.
class PersonInfo{
	void showPersonSleepingStyle(Person person) {
		if(person instanceof Student) {
			Student student = (Student)person;
			student.study();
		}
		person.showSleepingStyle();
	}
}

public class ParameterPolyTest1 {

	public static void main(String[] args) {
		PersonInfo pi = new PersonInfo();
		pi.showPersonSleepingStyle(new President());
		pi.showPersonSleepingStyle(new Employee1());
		pi.showPersonSleepingStyle(new Student());
	}

}
