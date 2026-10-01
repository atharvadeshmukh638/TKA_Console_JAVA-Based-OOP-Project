package package_com.TKA.SmartParking;

public class ParkingTicket {
	private final String ticketId;

	private Vehicle vehicle;

	public ParkingTicket(String ticketId, Vehicle vehicle) {

		this.ticketId = ticketId;
		this.vehicle = vehicle;
	}

	public String getTicketId() {
		return ticketId;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void displayTicket() {

		System.out.println();
		System.out.println("========== PARKING TICKET ==========");

		System.out.println("Ticket ID     : " + ticketId);

		System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());

		System.out.println("Owner Name    : " + vehicle.getOwnerName());

		System.out.println("====================================");
	}
}
