
public class DoubleForTest {

	public static void main(String[] args) {
		//이중 for문에서는 안쪽for는 바깥쪽 for문에서 볼때에 그냥 하나의 실행문이다
		//for(int i = 1; i<=9; i++) {
		//	for (int j=1; j<=9; j++) {
		//		System.out.println("i,j = "+ i + " " + j);
		//	}
		//}
		
		String a = "#";
		
		for(int i = 0;i <= 5;i++) {
			for (int j=0;j<i;j++) {
			System.out.print(a);
			}
			System.out.println();
		}
		
		for(int i = 0;i <= 5;i++) {
			for (int j=5;j>i;j--) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		for(int i = 0;i<=9;i++) {
			if(i<=4) {
			for (int j=0;j<i;j++) {
			System.out.print(a);
			}
			System.out.println();
			}
			else {
			for(int i = 0;i <= 5;i++) {
				for (int j=5;j>i;j--) {
					System.out.print(a);
				}
				System.out.println();
			}
			}
		}
	}
}
