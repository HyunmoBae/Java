//JVM 이 직접 실행하는 클래스가 아니고 다른 클래스에서 객체로 생성해서 기능을 사용하는 클래스
public class Car {
		//메소드
		//자바의 메소드 구조
		//리턴타입 메소드명(파라미터변수1,.....){
		//실행문들
		//}
		//메소드에서 호출한쪽으로 반환할 값이 없으면 리턴타입을 void로 지정한다.
		
		String company;
		String color;
		int displacement;
		int year;
		int velocity;
		
		void run() {
			System.out.println("달린다.");
		}
		
		void stop() {
			System.out.println("멈춘다.");
		}
		
		//동일한 메소드이름으로 인자를 다르게 정의해서 여러개의 메소드를 만드는 기능
		//메소드 오버로딩이라고 함.
		void speedUp() {
			velocity ++;
		}
		
		void speedUp(int amount) {
			velocity += amount;
		}
		
		void speedDown() {
			velocity--;
		}
		
		void speedDown(int amount) {
			velocity -= amount;
		}
		
	}


