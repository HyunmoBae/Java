
public class ArrayTest6 {

	public static void main(String[] args) {
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		
		//배열객체 생성
		arr1 = new int[2][3];
		
		//값 할당
		arr1[0] = new int[3];
		arr1[0][0] = 20;
		
		//배열객체를 생성하면 배열의 각 인덱스 영역에는 배열의 데이터타입의 기본값이 자동할당됨.
		//정수형 : 0
		//실수형 : 0.0
		//문자형 : ' '
		//참조형 : null
		//논리형 : false
		
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[i].length; j++) {
					System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
			
			int arr5[][] = {{1,2,3,},{4,5,6}};
			for (int i = 0; i < arr5.length; i++) {
				for (int j = 0; j < arr5[i].length; j++) {
					System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}
			
		int arr6[][] = new int[][] {{2,3,4,},{5,6,7}};
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				System.out.print(arr6[i][j] + " ");
		}
		System.out.println();
	}
	}
}
