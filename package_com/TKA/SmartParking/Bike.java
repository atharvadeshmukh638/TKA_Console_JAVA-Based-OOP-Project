package package_com.TKA.SmartParking;

public class Bike extends Vehicle {

	public Bike(String vehicleNumber, String ownerName) {
		super(vehicleNumber, ownerName);
	}

	@Override
	public double calculateFee(int hours) {
		return hours * 20;
	}

	@Override
	public void displayVehicle() {

		System.out.println("Vehicle Type   : Bike");

		super.displayVehicle();
	}
}
