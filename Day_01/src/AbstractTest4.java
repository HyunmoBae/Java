abstract class Ships{
	abstract String getName();
	abstract int getWeaponNumber();
	abstract int getPersonNumber();
}

class Boat extends Ships{
	@Override
	String getName() {
		return "쌩쌩보트";
	}
	@Override
	int getPersonNumber() {
		return 200;
	}
	@Override
	int getWeaponNumber() {
		return 0;
	}
}

class Cruise extends Ships{
	@Override
	String getName() {
		return "전함무궁화";
	}
	@Override
	int getPersonNumber() {
		return 300;
	}
	@Override
	int getWeaponNumber() {
		return 200;
	}
}

class ShipInfo{
	public static void search(Ships Ships) {
		System.out.println("이름 : " + Ships.getName());
		System.out.println("무기 : " + Ships.getWeaponNumber() + "정");
		System.out.println("사람 : " + Ships.getPersonNumber() + "명");
	}
}


public class AbstractTest4 {

	public static void main(String[] args) {
		ShipInfo.search(new Boat());
		System.out.println();
		ShipInfo.search(new Cruise());
		
	}

}
