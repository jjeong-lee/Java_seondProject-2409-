package alone;

public abstract class Car {

	void run() {
		System.out.println("차가 달립니다.");
	}

	void stop() {
		System.out.println("차가 멈춥니다.");
	}

	abstract void refuel();

}
