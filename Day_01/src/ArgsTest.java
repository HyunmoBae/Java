//자바의 인자전달 방식
//Call by Value

class Data{
	int x;
	int y;
	
	void addPriv(int x, int y) {
		x += 100;
		y += 100;
	}
	
	void addObj(Data data1){
		data1.x += 100;
		data1.y += 100;
	}
	
	void addRef(Data data1) {
		data1 = null;
	}
}
public class ArgsTest {

	public static void main(String[] args) {
		Data data1 = new Data();
		data1.x = 10;
		data1.y = 10;
		
		System.out.println(data1.x); //10
		System.out.println(data1.y); //10
		
		data1.addPriv(data1.x, data1.y);
		
		System.out.println(data1.x); //10
		System.out.println(data1.y); //10
	
		data1.addObj(data1);
		System.out.println(data1.x); //110
		System.out.println(data1.y); //110
		
		data1.addRef(data1);
		System.out.println(data1.x); //110
		System.out.println(data1.y); //110
		
	}

}
