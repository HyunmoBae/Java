
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ball[] = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		
		int index = -1;
		//랜덤하게 획득한 인덱스 번호를 저장할 변수
		
		int temp = 0;
		//두 인덱스에 있는 값을 교환할 때 값을 임시적으로 저장해 놓을 변수
		
		for(int i = 0; i < 100; i++ ) {
			index = (int)(Math.random()*44) + 1;
			temp = ball[0];
			ball[0] = ball[index];
			ball[index] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i]);
		}
	}

}
