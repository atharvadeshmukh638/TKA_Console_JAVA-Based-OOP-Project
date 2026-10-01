package package_com.TKA.SmartParking;

public class VIPVehicle extends Vehicle {

	public VIPVehicle(String vehicleNumber, String ownerName) {

		super(vehicleNumber, ownerName);
	}

	@Override
	public double calculateFee(int hours) {

		return hours * 80;
	}

	@Override
	public void displayVehicle() {

		System.out.println("Vehicle Type   : VIP Vehicle");

		super.displayVehicle();
	}
}
