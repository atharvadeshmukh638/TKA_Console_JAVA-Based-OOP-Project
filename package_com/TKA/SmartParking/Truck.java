package package_com.TKA.SmartParking;

public class Truck extends Vehicle {

	public Truck(String vehicleNumber, String ownerName) {
		super(vehicleNumber, ownerName);
	}
	@Override
	public double calculateFee(int hours) {
		return hours * 100;
	}
	@Override
	public void displayVehicle() {

		System.out.println("Vehicle Type   : Truck");

		super.displayVehicle();
	}
}
