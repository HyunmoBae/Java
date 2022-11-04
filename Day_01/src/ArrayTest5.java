public class ArrayTest5 {

	public static void main(String[] args) {
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int)(Math.random()*10)); // 0 ~ 9
		}
		System.out.println();
			//정렬
		int temp = 0;
			for(int i = 0; i<number.length; i++) {
				boolean changed = false;
				for (int j = 0; j < number.length -1; j++) {
					if(number[j] > number[j+1]) {
						temp = number[j];
						number[j] = number[j+1];
						number[j+1] = temp;
						changed = true;
					}
					
			}
				if(!changed) {
					break;
				}
				
				for (int j = 0; j < number.length; j++) {
					System.out.print(number[j]);
					
				}
				System.out.println();
			}
			
	}
}
