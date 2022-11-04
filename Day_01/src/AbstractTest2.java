abstract class Vehicle{
	abstract void transfer();
}

class Car1 extends Vehicle{
	@Override
	void transfer() {
		System.out.println("차도로 나른다.");
	}
}

class Ship extends Vehicle{
	@Override
	void transfer() {
		System.out.println("수로로 나른다.");
	}
}

class Plane extends Vehicle{
	@Override
	void transfer() {
		System.out.println("하늘로 나른다.");
	}
}

class VehicleInfo{
	void printTransferStyle(Vehicle vehicle) {
		vehicle.transfer();
	}
}

public class AbstractTest2 {

	public static void main(String[] args) {
		VehicleInfo vf = new VehicleInfo();
		vf.printTransferStyle(new Car1());
		vf.printTransferStyle(new Plane());
		vf.printTransferStyle(new Ship());
		
	}

}
