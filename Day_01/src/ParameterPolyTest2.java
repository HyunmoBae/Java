class Gajun{
	
	@Override
	public String toString() {
		return "Gajun";
	}
}

class Machine extends Gajun{
	
	@Override
	public String toString() {
		return "Machine";
	}
}

class Microwave extends Gajun{
	@Override
	public String toString() {
		return "Microwave";
	}
}

class Computer extends Gajun{
	@Override
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	Gajun[] gajunArray = new Gajun[3];
	int index = 0;
	void order(Gajun gajun) {
		gajunArray[index++] = gajun;
		 System.out.println(gajun + "을 주문했습니다.");
	}
		 
	void showOrderList() {
		String orderItem = "";
		for (int i = 0; i < gajunArray.length; i++) {
			orderItem += (i == 0) ? gajunArray[i] : ", " + gajunArray[i];
		}
		
		System.out.println("주문목록 : " + orderItem);
	}
}

public class ParameterPolyTest2 {
	
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.order(new Computer());
		buyer.order(new Machine());
		buyer.order(new Microwave());
		
		buyer.showOrderList();
	}
}
