package package_com.TKA.SmartParking;

public class Car extends Vehicle {

	public Car(String vehicleNumber, String ownerName) {
		super(vehicleNumber, ownerName);
	}

	@Override
	public double calculateFee(int hours) {
		return hours * 50;
	}

	@Override
	public void displayVehicle() {

		System.out.println("Vehicle Type   : Car");

		super.displayVehicle();
	}
}
