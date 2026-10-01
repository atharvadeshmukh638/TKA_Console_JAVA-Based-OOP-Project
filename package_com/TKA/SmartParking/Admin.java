package package_com.TKA.SmartParking;

public class Admin {
	private String username;
	private String password;

	public Admin() {

		username = "admin";
		password = "1234";
	}

	public boolean login(String username, String password) {

		if (this.username.equals(username) && this.password.equals(password)) {

			return true;

		} else {

			return false;
		}
	}

	public void displayAdminMenu() {

		System.out.println();
		System.out.println("========== ADMIN ==========");
		System.out.println("1. Display Parking");
		System.out.println("2. Display Statistics");
		System.out.println("3. Exit");
		System.out.println("===========================");
	}
}
