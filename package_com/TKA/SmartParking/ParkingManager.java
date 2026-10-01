package package_com.TKA.SmartParking;

public class ParkingManager {

    private ParkingFloor[] floors;

    private static int totalVehicles = 0;

    private static double totalRevenue = 0;

    public static final String PARKING_NAME =
            "TKA SMART PARKING";

    public ParkingManager() {

        floors = new ParkingFloor[2];

        floors[0] = new ParkingFloor(1);
        floors[1] = new ParkingFloor(2);
    }

    public void displayAllFloors() {

        for (int i = 0; i < floors.length; i++) {

            floors[i].displayFloor();
        }
    }

    public void parkVehicle(Vehicle vehicle) {

        for (int i = 0; i < floors.length; i++) {

            ParkingSlot[] slots = floors[i].getSlots();

            for (int j = 0; j < slots.length; j++) {

                if (slots[j].isOccupied() == false) {

                    String type = slots[j].getSlotType();

                    if (vehicle instanceof Bike
                            && type.equals("Bike")) {

                        slots[j].parkVehicle(vehicle);

                        totalVehicles++;

                        System.out.println("Floor : "
                                + floors[i].getFloorNumber());

                        System.out.println("Slot  : "
                                + slots[j].getSlotId());

                        return;
                    }

                    if (vehicle instanceof Car
                            && type.equals("Car")) {

                        slots[j].parkVehicle(vehicle);

                        totalVehicles++;

                        System.out.println("Floor : "
                                + floors[i].getFloorNumber());

                        System.out.println("Slot  : "
                                + slots[j].getSlotId());

                        return;
                    }

                    if (vehicle instanceof Truck
                            && type.equals("Truck")) {

                        slots[j].parkVehicle(vehicle);

                        totalVehicles++;

                        System.out.println("Floor : "
                                + floors[i].getFloorNumber());

                        System.out.println("Slot  : "
                                + slots[j].getSlotId());

                        return;
                    }

                    if (vehicle instanceof ElectricVehicle
                            && type.equals("EV")) {

                        slots[j].parkVehicle(vehicle);

                        totalVehicles++;

                        System.out.println("Floor : "
                                + floors[i].getFloorNumber());

                        System.out.println("Slot  : "
                                + slots[j].getSlotId());

                        return;
                    }

                    if (vehicle instanceof VIPVehicle
                            && type.equals("Car")) {

                        slots[j].parkVehicle(vehicle);

                        totalVehicles++;

                        System.out.println("VIP vehicle parked.");

                        System.out.println("Floor : "
                                + floors[i].getFloorNumber());

                        System.out.println("Slot  : "
                                + slots[j].getSlotId());

                        return;
                    }
                }
            }
        }

        System.out.println("No suitable parking slot available.");
    }

    public ParkingSlot findVehicle(String vehicleNumber) {

        for (int i = 0; i < floors.length; i++) {

            ParkingSlot[] slots = floors[i].getSlots();

            for (int j = 0; j < slots.length; j++) {

                if (slots[j].isOccupied() == true) {

                    Vehicle v = slots[j].getVehicle();

                    if (v.getVehicleNumber()
                            .equals(vehicleNumber)) {

                        return slots[j];
                    }
                }
            }
        }

        return null;
    }

    public void searchVehicle(String vehicleNumber) {

        ParkingSlot slot = findVehicle(vehicleNumber);

        if (slot != null) {

            System.out.println();
            System.out.println("Vehicle Found!");

            slot.getVehicle().displayVehicle();

            System.out.println("Slot : "
                    + slot.getSlotId());

        } else {

            System.out.println("Vehicle not found.");
        }
    }

    public double calculateParkingFee(
            String vehicleNumber, int hours) {

        ParkingSlot slot = findVehicle(vehicleNumber);

        if (slot != null) {

            Vehicle v = slot.getVehicle();

            double fee = v.calculateFee(hours);

            return fee;

        } else {

            return 0;
        }
    }

    public void removeVehicle(
            String vehicleNumber,
            int hours,
            boolean lostTicket) {

        ParkingSlot slot = findVehicle(vehicleNumber);

        if (slot == null) {

            System.out.println("Vehicle not found.");
            return;
        }

        Vehicle vehicle = slot.getVehicle();

        double parkingFee = vehicle.calculateFee(hours);

        double peakCharge = 0;

        if (hours >= 5) {

            peakCharge = parkingFee * 0.20;
        }

        double lostCharge = 0;

        if (lostTicket == true) {

            lostCharge = 500;
        }

        double chargingFee = 0;

        if (vehicle instanceof ElectricVehicle) {

            ElectricVehicle ev =
                    (ElectricVehicle) vehicle;

            chargingFee = ev.calculateChargingFee();
        }

        double total = parkingFee
                + peakCharge
                + lostCharge
                + chargingFee;

        totalRevenue = totalRevenue + total;

        ParkingReceipt receipt =
                new ParkingReceipt(
                        vehicle,
                        slot,
                        hours,
                        parkingFee,
                        peakCharge,
                        chargingFee,
                        lostCharge,
                        total);

        receipt.displayReceipt();

        slot.removeVehicle();

        totalVehicles--;
    }

    public void displayStatistics() {

        int available = 0;
        int occupied = 0;

        for (int i = 0; i < floors.length; i++) {

            ParkingSlot[] slots = floors[i].getSlots();

            for (int j = 0; j < slots.length; j++) {

                if (slots[j].isOccupied() == true) {

                    occupied++;

                } else {

                    available++;
                }
            }
        }

        System.out.println();
        System.out.println("========== STATISTICS ==========");

        System.out.println("Parking Name     : "
                + PARKING_NAME);

        System.out.println("Occupied Slots   : "
                + occupied);

        System.out.println("Available Slots  : "
                + available);

        System.out.println("Total Vehicles   : "
                + totalVehicles);

        System.out.println("Total Revenue    : ₹"
                + totalRevenue);

        System.out.println("================================");
    }
}