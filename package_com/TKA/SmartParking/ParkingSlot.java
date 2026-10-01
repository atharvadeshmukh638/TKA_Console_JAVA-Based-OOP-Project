package package_com.TKA.SmartParking;

public class ParkingSlot {
	private int slotId;
	private String slotType;
	private boolean occupied;
	private Vehicle vehicle;

	public ParkingSlot(int slotId, String slotType) {

		this.slotId = slotId;
		this.slotType = slotType;
		this.occupied = false;
	}

	public int getSlotId() {
		return slotId;
	}

	public String getSlotType() {
		return slotType;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void parkVehicle(Vehicle vehicle) {

		if (occupied == false) {

			this.vehicle = vehicle;
			occupied = true;

			System.out.println("Vehicle parked successfully.");

		} else {

			System.out.println("Slot is already occupied.");
		}
	}

	public void removeVehicle() {

		if (occupied == true) {

			vehicle = null;
			occupied = false;

			System.out.println("Vehicle removed successfully.");

		} else {

			System.out.println("Slot is already empty.");
		}
	}

	public void displaySlot() {

		System.out.println("-----------------------------");

		System.out.println("Slot ID   : " + slotId);
		System.out.println("Slot Type : " + slotType);

		if (occupied == true) {

			System.out.println("Status    : Occupied");
			System.out.println("Vehicle   : " + vehicle.getVehicleNumber());

		} else {

			System.out.println("Status    : Empty");
		}

		System.out.println("-----------------------------");
	}
}
