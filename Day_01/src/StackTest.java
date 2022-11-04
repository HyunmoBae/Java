import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		String[] flowerArray = {"개나리","안개꽃","민들레","코스모스","국화"};
		
		Stack<String> stack = new Stack<>();
		for(String flower : flowerArray ) {
			stack.push(flower);
		}
		while(!stack.isEmpty()) {
			//isEmpty() : Collection 인터페이스에서 제공, 해당 컬렉션에 요소가 하나도 없으면 True를 반환
			System.out.println(stack.pop());
		}
	}
}




