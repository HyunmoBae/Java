public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.company = "대가대";
		System.out.println(myCar.company);
		
		myCar.speedUp();
		myCar.speedUp(100);
		myCar.speedDown(51);
		System.out.println(myCar.velocity);

		Car yourCar = new Car();
		yourCar.company = "대가대2";
		System.out.println(yourCar.company);
		
		yourCar = myCar;
		System.out.println(yourCar.company);
		System.out.println(yourCar.velocity);
		
		
	}

}
