class Super{
	String name = "배현모";
	
}

class Sub extends Super{
	String name = "모현배";
	
	String getLocalName() {
		String name = "김영란";
		
		return name;
	}
	
	//자기자신 클래스에 정의된 name 속성에 접근
	String getThisName() {
		String name = "김영란";
		
		return this.name;
	}
	
	//부모 클래스에 정의된 name 속성에 접근
	String getSuperName() {
		String name = "김영란";
		
		return super.name;
	}
}

public class ThisSuperTest {

	public static void main(String[] args) {
		Sub test = new Sub();
		System.out.println(test.name);
		System.out.println(test.getLocalName());
		System.out.println(test.getThisName());
		System.out.println(test.getSuperName());

	}
}


