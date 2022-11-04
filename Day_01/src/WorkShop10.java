import java.util.Scanner;

interface Speed{
	int SPEED = 10;
	void upSpeed(int inc);
	void downSpeed(int dec);
	void stop();
}

interface Display {
	void disp();
}

class Cars implements Speed,Display{
	int inputVelocity;
	int velocity = SPEED;
	@Override
	public void upSpeed(int inc) {
		velocity = velocity	+ inc;
	}
	@Override
	public void downSpeed(int dec) {
		velocity = velocity + dec;
	}
	@Override
	public void stop() {
		System.out.println("정지하셨습니다.");
	}
	@Override
	public void disp() {
		if(inputVelocity >= 0) {
			upSpeed(inputVelocity);
		}
		else if(inputVelocity < 0) {
			downSpeed(inputVelocity);
		}
		
		if(velocity <= 0) {
			stop();
		}
		else {
			System.out.println("현재 속도는 " + velocity + "km/h 입니다.");
		}
	}
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("속도를 입력하세요 : ");
		inputVelocity = scanner.nextInt();
		disp();
	}
}

public class WorkShop10 {

	public static void main(String[] args) {
		Cars car = new Cars();
		boolean stop = false;
		do {
			car.input();
			if(car.velocity == 0) {
				stop = true;
			}
		} while (!stop);
		
		}
	}

