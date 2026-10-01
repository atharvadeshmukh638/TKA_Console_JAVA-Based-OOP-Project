package package_com.TKA.SmartParking;

public class Vehicle {
	private String vehicleNumber;
	private String ownerName;

	public Vehicle(String vehicleNumber, String ownerName) {
		this.vehicleNumber = vehicleNumber;
		this.ownerName = ownerName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void displayVehicle() {
		System.out.println("Vehicle Number : " + vehicleNumber);
		System.out.println("Owner Name     : " + ownerName);
	}

	public double calculateFee(int hours) {
		return hours * 30;
	}
}
