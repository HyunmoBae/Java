class Employee{
	String name;
	String department;
	int salary;
	
	String getInformation() {
		return "이름 : " + name + ", 부서 : " + department + ", 급여 : " + salary;
		
	}
}

class Salesman extends Employee{
	int commission;
	
	String getInformation() {
		return super.getInformation() + ", 수당 : " + commission; //super(부모에있는것을 지정할때)
	}
}

public class SuperTest {

	public static void main(String[] args) {
		Salesman man1 = new Salesman();
		man1.name = "bhm";
		man1.department = "dcu";
		man1.salary = 30000;
		man1.commission = 20000;
		System.out.println(man1.getInformation());
	}

}
