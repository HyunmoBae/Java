
public class WorkShop6 {

	public static void main(String[] args) {
		int i = 0, ans = 0;
		while(ans<=100) {
			ans += (i%2==0)? -i : i;
			i++;
		}
		System.out.println(i);
	}
	
}
