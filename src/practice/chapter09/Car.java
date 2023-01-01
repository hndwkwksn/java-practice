package practice.chapter09;

public class Car {
	private double fuelCost;
	private double fuelAmount;

	public Car(double a, double b) {
		this.fuelCost = a;
		this.fuelAmount = b;
	}

	public void move(int distance) {
		System.out.println(distance + " km 走ります。");
		this.fuelAmount -= distance / fuelCost;
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
