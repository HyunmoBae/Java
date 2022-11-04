//this
//자기 자신객체를 가리키는 참조변수
//사용할때 : 파라미터 변수와 멤버변수의 이름이 같을때. 특정변수가 멤버변수임을 지정할때 사용됨
class Data2{
	int x;
	public Data2(int x) {
		x = x;
		this.x = x;
	}
	
	public void printInfo1(){
		int result = this.x;
		printInfo2();
	}
	public void printInfo2(){
		
	}
}
public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 data2 = new Data2(10);
		System.out.println(data2.x);
	}

}
