package package_com.TKA.SmartParking;

public class ParkingFloor {

	private int floorNumber;
	private ParkingSlot[] slots;
	public ParkingFloor(int floorNumber) {

		this.floorNumber = floorNumber;
		slots = new ParkingSlot[5];

		slots[0] = new ParkingSlot(1, "Bike");
		slots[1] = new ParkingSlot(2, "Car");
		slots[2] = new ParkingSlot(3, "Car");
		slots[3] = new ParkingSlot(4, "Truck");
		slots[4] = new ParkingSlot(5, "EV");
	}

	public int getFloorNumber() {
		return floorNumber;
	}
	public ParkingSlot[] getSlots() {
		return slots;
	}
	public void displayFloor() {
		System.out.println();
		System.out.println("========== FLOOR " + floorNumber + " ==========");

		for (int i = 0; i < slots.length; i++) {

			slots[i].displaySlot();
		}
	}
}
