import java.util.Iterator;

public class VarArgsTest {
	void printInfo(String...info) {
		//가변 길이로 인자가 전달되면 파라미터 변수는 배열객체로 인식됨
		
		for(int i = 0; i < info.length; i++) {
			System.out.println("info[" + i + "] = " + info[i]);
		}
		
		System.out.println("--------------------------------");
		
	}
	
	public static void main(String[] args) {
		VarArgsTest vt = new VarArgsTest();
		vt.printInfo();
		vt.printInfo("aaa");
		vt.printInfo("aaa","bbb");
		
	}

}
