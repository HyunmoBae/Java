//배열에 점수 저장, 총점과 평균 구하기
public class ArrayTest2 {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0;
		
		int score[] = {100,90,80,70,60};
		
		
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		
		int x = 5;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}

}
