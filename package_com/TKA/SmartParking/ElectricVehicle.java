package package_com.TKA.SmartParking;

public class ElectricVehicle extends Vehicle {

	private int chargingUnits;
	public ElectricVehicle(String vehicleNumber, String ownerName, int chargingUnits) {
		super(vehicleNumber, ownerName);
		this.chargingUnits = chargingUnits;
	}

	@Override
	public double calculateFee(int hours) {
		return hours * 40;
	}

	public double calculateChargingFee() {
		return chargingUnits * 10;
	}
	public int getChargingUnits() {
		return chargingUnits;
	}

	@Override
	public void displayVehicle() {
		System.out.println("Vehicle Type   : Electric Vehicle");
		super.displayVehicle();
		System.out.println("Charging Units : " + chargingUnits);
	}

}
