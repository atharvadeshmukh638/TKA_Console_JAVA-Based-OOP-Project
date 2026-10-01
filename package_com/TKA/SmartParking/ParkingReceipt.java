package package_com.TKA.SmartParking;

public class ParkingReceipt {

	    private Vehicle vehicle;
	    private ParkingSlot slot;

	    private int hours;

	    private double parkingFee;
	    private double peakCharge;
	    private double chargingFee;
	    private double lostCharge;
	    private double total;

	    public ParkingReceipt(
	            Vehicle vehicle,
	            ParkingSlot slot,
	            int hours,
	            double parkingFee,
	            double peakCharge,
	            double chargingFee,
	            double lostCharge,
	            double total) {

	        this.vehicle = vehicle;
	        this.slot = slot;
	        this.hours = hours;
	        this.parkingFee = parkingFee;
	        this.peakCharge = peakCharge;
	        this.chargingFee = chargingFee;
	        this.lostCharge = lostCharge;
	        this.total = total;
	    }

	    public void displayReceipt() {

	        System.out.println();
	        System.out.println("======================================");
	        System.out.println("       SMART PARKING RECEIPT");
	        System.out.println("======================================");

	        System.out.println("Vehicle Number : "
	                + vehicle.getVehicleNumber());

	        System.out.println("Owner Name     : "
	                + vehicle.getOwnerName());

	        System.out.println("Slot Number    : "
	                + slot.getSlotId());

	        System.out.println("Slot Type      : "
	                + slot.getSlotType());

	        System.out.println("Parking Hours  : "
	                + hours);

	        System.out.println("--------------------------------------");

	        System.out.println("Parking Fee    : ₹"
	                + parkingFee);

	        System.out.println("Peak Charge    : ₹"
	                + peakCharge);

	        System.out.println("Charging Fee   : ₹"
	                + chargingFee);

	        System.out.println("Lost Ticket    : ₹"
	                + lostCharge);

	        System.out.println("--------------------------------------");

	        System.out.println("TOTAL AMOUNT   : ₹"
	                + total);

	        System.out.println("======================================");
	    }
	}

