class Parent{
	int parentVar;
	
	void parentMethod() {
		System.out.println("parent method");
	}
}

class Child extends Parent{
	int childMethod;
	
	void childMethod() {
		System.out.println("child method");
	}
}
	
class GrandChild extends Child{
	int grandchildMethod;
	
	void grandchildMethod() {
		System.out.println("grandchild method");
	}
}

public class ExtendsTest1 {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentMethod();
		
		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		
		GrandChild gc = new GrandChild();
		gc.grandchildMethod();
		gc.childMethod();
		gc.parentMethod();
		
	}

}
