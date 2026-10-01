package package_com.TKA.SmartParking;
import java.util.Scanner;

public class SmartParkingMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ParkingManager pm = new ParkingManager();
		Admin admin = new Admin();

		while (true) {
			System.out.println();
			System.out.println("======================================");
			System.out.println("       SMART PARKING MANAGEMENT");
			System.out.println("======================================");

			System.out.println("1. Park Bike");
			System.out.println("2. Park Car");
			System.out.println("3. Park Truck");
			System.out.println("4. Park Electric Vehicle");
			System.out.println("5. Park VIP Vehicle");
			System.out.println("6. Search Vehicle");
			System.out.println("7. Remove Vehicle");
			System.out.println("8. Display Parking");
			System.out.println("9. Admin Login");
			System.out.println("10. Exit");

			System.out.print("Enter Choice : ");

			int choice = sc.nextInt();

			sc.nextLine();

			switch (choice) {

			case 1:

				System.out.print("Vehicle Number : ");
				String bikeNo = sc.nextLine();

				System.out.print("Owner Name : ");
				String bikeOwner = sc.nextLine();

				Bike bike = new Bike(bikeNo, bikeOwner);

				pm.parkVehicle(bike);

				break;

			case 2:

				System.out.print("Vehicle Number : ");
				String carNo = sc.nextLine();

				System.out.print("Owner Name : ");
				String carOwner = sc.nextLine();

				Car car = new Car(carNo, carOwner);

				pm.parkVehicle(car);

				break;

			case 3:

				System.out.print("Vehicle Number : ");
				String truckNo = sc.nextLine();

				System.out.print("Owner Name : ");
				String truckOwner = sc.nextLine();

				Truck truck = new Truck(truckNo, truckOwner);

				pm.parkVehicle(truck);

				break;

			case 4:

				System.out.print("Vehicle Number : ");
				String evNo = sc.nextLine();

				System.out.print("Owner Name : ");
				String evOwner = sc.nextLine();

				System.out.print("Charging Units : ");
				int units = sc.nextInt();

				ElectricVehicle ev = new ElectricVehicle(evNo, evOwner, units);

				pm.parkVehicle(ev);

				break;

			case 5:

				System.out.print("Vehicle Number : ");
				String vipNo = sc.nextLine();

				System.out.print("Owner Name : ");
				String vipOwner = sc.nextLine();

				VIPVehicle vip = new VIPVehicle(vipNo, vipOwner);

				pm.parkVehicle(vip);

				break;

			case 6:

				System.out.print("Vehicle Number : ");
				String searchNo = sc.nextLine();

				pm.searchVehicle(searchNo);

				break;

			case 7:

				System.out.print("Vehicle Number : ");
				String removeNo = sc.nextLine();

				System.out.print("Parking Hours : ");
				int hours = sc.nextInt();

				System.out.print("Lost Ticket? (true/false) : ");

				boolean lostTicket = sc.nextBoolean();

				pm.removeVehicle(removeNo, hours, lostTicket);

				break;

			case 8:

				pm.displayAllFloors();

				break;

			case 9:

				System.out.print("Username : ");
				String username = sc.nextLine();

				System.out.print("Password : ");
				String password = sc.nextLine();

				boolean login = admin.login(username, password);

				if (login == true) {

					System.out.println("Login Successful!");

					while (true) {

						admin.displayAdminMenu();

						System.out.print("Enter Choice : ");

						int adminChoice = sc.nextInt();

						if (adminChoice == 1) {

							pm.displayAllFloors();

						} else if (adminChoice == 2) {

							pm.displayStatistics();

						} else if (adminChoice == 3) {

							break;

						} else {

							System.out.println("Invalid Choice.");
						}
					}

				} else {

					System.out.println("Invalid Username or Password.");
				}

				break;

			case 10:

				System.out.println("Thank You for using Smart Parking System!");

				sc.close();

				return;

			default:

				System.out.println("Invalid Choice.");
			}
		}
	}
}
