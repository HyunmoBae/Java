
public class WorkShop1 {
	public static void main(String[] args) {
		int numOfApples = 110;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples % sizeOfBucket == 0)? (numOfApples / sizeOfBucket) : (numOfApples / sizeOfBucket + 1); 
		
		/*if(numOfApples % sizeOfBucket == 0) {
			numOfBucket = numOfApples / sizeOfBucket; 
		}
		else {
			numOfBucket = numOfApples / sizeOfBucket + 1;
			
		}
		System.out.println(numOfBucket);*/
		
		System.out.println(numOfBucket);
	}
}
