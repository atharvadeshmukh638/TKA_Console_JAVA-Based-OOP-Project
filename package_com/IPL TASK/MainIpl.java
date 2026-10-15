package October_14;

import java.util.*;

public class MainIpl {
	public static void main(String[] args) {

		List<Player> rcbPlayersList = new ArrayList<>();
		rcbPlayersList.add(new Player(12, "Virat Kohli", "Batsman", 8000, 4, 110));
		rcbPlayersList.add(new Player(13, "Faf du Plessis", "Batsman", 4000, 0, 75));
		rcbPlayersList.add(new Player(14, "Glenn Maxwell", "All-Rounder", 2700, 35, 45));
		rcbPlayersList.add(new Player(15, "Dinesh Karthik", "Wicketkeeper", 4800, 0, 140));
		rcbPlayersList.add(new Player(16, "Cameron Green", "All-Rounder", 700, 15, 20));
		rcbPlayersList.add(new Player(17, "Mohammed Siraj", "Bowler", 80, 80, 22));
		rcbPlayersList.add(new Player(18, "Rajat Patidar", "Batsman", 800, 0, 15));
		rcbPlayersList.add(new Player(19, "Yash Dayal", "Bowler", 10, 30, 8));
		rcbPlayersList.add(new Player(20, "Lockie Ferguson", "Bowler", 40, 45, 10));
		rcbPlayersList.add(new Player(21, "Karn Sharma", "Bowler", 50, 70, 18));
		rcbPlayersList.add(new Player(22, "Anuj Rawat", "Wicketkeeper", 300, 0, 15));

		List<Player> cskPlayersList = new ArrayList<>();
		cskPlayersList.add(new Player(1, "MS Dhoni", "Wicketkeeper", 5000, 0, 150));
		cskPlayersList.add(new Player(2, "Ruturaj Gaikwad", "Batsman", 2000, 0, 30));
		cskPlayersList.add(new Player(3, "Ravindra Jadeja", "All-Rounder", 2700, 150, 80));
		cskPlayersList.add(new Player(4, "Devon Conway", "Batsman", 1200, 0, 20));
		cskPlayersList.add(new Player(5, "Shivam Dube", "All-Rounder", 1100, 10, 15));
		cskPlayersList.add(new Player(6, "Deepak Chahar", "Bowler", 100, 75, 25));
		cskPlayersList.add(new Player(7, "Matheesha Pathirana", "Bowler", 10, 45, 10));
		cskPlayersList.add(new Player(8, "Moeen Ali", "All-Rounder", 1000, 35, 30));
		cskPlayersList.add(new Player(9, "Ajinkya Rahane", "Batsman", 4400, 0, 50));
		cskPlayersList.add(new Player(10, "Tushar Deshpande", "Bowler", 20, 40, 12));
		cskPlayersList.add(new Player(11, "Maheesh Theekshana", "Bowler", 30, 50, 15));

		List<Player> miPlayersList = new ArrayList<>();
		miPlayersList.add(new Player(23, "Rohit Sharma", "Batsman", 6500, 15, 100));
		miPlayersList.add(new Player(24, "Hardik Pandya", "All-Rounder", 2500, 70, 60));
		miPlayersList.add(new Player(25, "Suryakumar Yadav", "Batsman", 3500, 0, 70));
		miPlayersList.add(new Player(26, "Jasprit Bumrah", "Bowler", 80, 165, 35));
		miPlayersList.add(new Player(27, "Ishan Kishan", "Wicketkeeper", 2300, 0, 90));
		miPlayersList.add(new Player(28, "Tilak Varma", "Batsman", 1000, 0, 20));
		miPlayersList.add(new Player(29, "Tim David", "Batsman", 800, 2, 30));
		miPlayersList.add(new Player(30, "Gerald Coetzee", "Bowler", 40, 20, 10));
		miPlayersList.add(new Player(31, "Piyush Chawla", "Bowler", 600, 180, 40));
		miPlayersList.add(new Player(32, "Akash Madhwal", "Bowler", 10, 25, 5));
		miPlayersList.add(new Player(33, "Naman Dhir", "All-Rounder", 200, 5, 8));

		Map<String, List<Player>> allIplTeamsMap = new HashMap<>();
		allIplTeamsMap.put("RCB", rcbPlayersList);
		allIplTeamsMap.put("MI", miPlayersList);
		allIplTeamsMap.put("CSK", cskPlayersList);

		Set<String> teamNamesKey = allIplTeamsMap.keySet();
		for (String tn : teamNamesKey) {
			System.out.println("\n" + tn + " -> >> ");
			List<Player> listPlayers = allIplTeamsMap.get(tn);

			System.out.println("\n* IPL Batters");
			for (Player p : listPlayers) {
				if (p.getCategory().equalsIgnoreCase("Batsman")) {
					System.out.println("  " + p);
				}
			}

			System.out.println("\n* IPL Bowlers:");
			for (Player p : listPlayers) {
				if (p.getCategory().equalsIgnoreCase("Bowler")) {
					System.out.println("  " + p);
				}
			}

			System.out.println("\n* IPL All-Rounders:");
			for (Player p : listPlayers) {
				if (p.getCategory().equalsIgnoreCase("All-Rounder")) {
					System.out.println("  " + p);
				}
			}
		}

		// Task 5: Highest wicket taker in IPL
		System.out.println("\n5. HIGHEST WICKET TAKER IN IPL");
		Player highestWickets = null;

		for (List<Player> players : allIplTeamsMap.values()) {
			for (Player p : players) {
				if (highestWickets == null || p.getWickets() > highestWickets.getWickets()) {
					highestWickets = p;
				}
			}
		}
		System.out.println(highestWickets.getName() + " - " + highestWickets.getWickets() + " wickets");

		// Task 6: Display all wicket-keepers
		System.out.println("\n6. ALL WICKET-KEEPERS");
		for (List<Player> players : allIplTeamsMap.values()) {
			for (Player p : players) {
				if (p.getCategory().equalsIgnoreCase("Wicketkeeper")) {
					System.out.println(p.getName());
				}
			}
		}

		// Task 7: CSK batsmen
		System.out.println("\n7. CSK BATSMEN");
		for (Player p : cskPlayersList) {
			if (p.getCategory().equalsIgnoreCase("Batsman")) {
				System.out.println(p.getName());
			}
		}

		// Task 8: Highest catches in IPL
		System.out.println("\n8. HIGHEST CATCHES IN IPL");
		Player highestCatches = null;
		for (List<Player> players : allIplTeamsMap.values()) {
			for (Player p : players) {
				if (highestCatches == null || p.getCatches() > highestCatches.getCatches()) {
					highestCatches = p;
				}
			}
		}
		System.out.println(highestCatches.getName() + " - " + highestCatches.getCatches() + " catches");

		// Task 9: All-rounders
		System.out.println("\n9. ALL IPL ALL-ROUNDERS");
		for (List<Player> players : allIplTeamsMap.values()) {
			for (Player p : players) {
				if (p.getCategory().equalsIgnoreCase("All-Rounder")) {
					System.out.println(p.getName());
				}
			}
		}

		// Task 10: RCB bowlers
		System.out.println("\n10. RCB BOWLERS");
		for (Player p : rcbPlayersList) {
			if (p.getCategory().equalsIgnoreCase("Bowler")) {
				System.out.println(p.getName());
			}
		}

		// Task 11: MI batsmen
		System.out.println("\n11. MI BATSMEN");
		for (Player p : miPlayersList) {
			if (p.getCategory().equalsIgnoreCase("Batsman")) {
				System.out.println(p.getName());
			}
		}

		// Task 12: Count players in each team
		System.out.println("\n12. TOTAL PLAYERS IN EACH TEAM");
		for (String team : allIplTeamsMap.keySet()) {
			System.out.println(team + ": " + allIplTeamsMap.get(team).size() + " players");
		}

		// Task 13: Highest run scorer in each team
		System.out.println("\n13. HIGHEST RUN SCORER IN EACH TEAM");
		for (String team : allIplTeamsMap.keySet()) {
			Player topPlayer = null;
			for (Player p : allIplTeamsMap.get(team)) {
				if (topPlayer == null || p.getRuns() > topPlayer.getRuns()) {
					topPlayer = p;
				}
			}
			System.out.println(team + ": " + topPlayer.getName() + " - " + topPlayer.getRuns() + " runs");
		}

		// Task 14: All batsman
		System.out.println("\n14. ALL IPL BATSMEN");
		for (List<Player> players : allIplTeamsMap.values()) {
			for (Player p : players) {
				if (p.getCategory().equalsIgnoreCase("Batsman")) {
					System.out.println(p.getName());
				}
			}
		}

		// Task 15: Highest wicket taker in each team
		System.out.println("\n15. HIGHEST WICKET TAKER IN EACH TEAM");
		for (String team : allIplTeamsMap.keySet()) {
			Player topBowler = null;
			for (Player p : allIplTeamsMap.get(team)) {
				if (topBowler == null || p.getWickets() > topBowler.getWickets()) {
					topBowler = p;
				}
			}
			System.out.println(team + ": " + topBowler.getName() + " - " + topBowler.getWickets() + " wickets");
		}

		// Task 16: CSK all-rounders
		System.out.println("\n16. CSK ALL-ROUNDERS");
		for (Player p : cskPlayersList) {
			if (p.getCategory().equalsIgnoreCase("All-Rounder")) {
				System.out.println(p.getName());
			}
		}

		// Task 17: Highest catches in each team
		System.out.println("\n17. HIGHEST CATCHES IN EACH TEAM");
		for (String team : allIplTeamsMap.keySet()) {
			Player bestCatcher = null;
			for (Player p : allIplTeamsMap.get(team)) {
				if (bestCatcher == null || p.getCatches() > bestCatcher.getCatches()) {
					bestCatcher = p;
				}
			}
			System.out.println(team + ": " + bestCatcher.getName() + " - " + bestCatcher.getCatches() + " catches");
		}

		// Task 18: RCB batsman
		System.out.println("\n18. RCB BATSMAN");
		for (Player p : rcbPlayersList) {
			if (p.getCategory().equalsIgnoreCase("Batsman")) {
				System.out.println(p.getName());
			}
		}

		// Task 19: Total runs scored by each team
		System.out.println("\n19. TOTAL RUNS BY EACH TEAM");
		for (String team : allIplTeamsMap.keySet()) {
			int totalRuns = 0;
			for (Player p : allIplTeamsMap.get(team)) {
				totalRuns += p.getRuns();
			}
			System.out.println(team + ": " + totalRuns + " runs");
		}

		// Task 20: Search for a player by name
		System.out.println("\n20. SEARCH PLAYER BY NAME");
		String searchName = "Virat Kohli";
		boolean found = false;
		for (String team : allIplTeamsMap.keySet()) {
			for (Player p : allIplTeamsMap.get(team)) {
				if (p.getName().equalsIgnoreCase(searchName)) {
					System.out.println("Player found!");
					System.out.println("Team: " + team);
					System.out.println(p);
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		if (!found) {
			System.out.println("Player not found: " + searchName);
		}

		// Task 21: Count players by category
		System.out.println("\n21. PLAYER COUNT BY CATEGORY");
		int batsmen = 0;
		int bowlers = 0;
		int allRounders = 0;
		int wicketKeepers = 0;

		for (List<Player> players : allIplTeamsMap.values()) {
			for (Player p : players) {
				if (p.getCategory().equalsIgnoreCase("Batsman")) {
					batsmen++;
				} else if (p.getCategory().equalsIgnoreCase("Bowler")) {
					bowlers++;
				} else if (p.getCategory().equalsIgnoreCase("All-Rounder")) {
					allRounders++;
				} else if (p.getCategory().equalsIgnoreCase("Wicketkeeper")) {
					wicketKeepers++;
				}
			}
		}
		System.out.println("Batsmen: " + batsmen);
		System.out.println("Bowlers: " + bowlers);
		System.out.println("All-Rounders: " + allRounders);
		System.out.println("Wicket-Keepers: " + wicketKeepers);

		// Task 22: Players scoring more than 400 runs
		System.out.println("\n22. PLAYERS WITH MORE THAN 400 RUNS");
		for (String team : allIplTeamsMap.keySet()) {
			for (Player p : allIplTeamsMap.get(team)) {
				if (p.getRuns() > 400) {
					System.out.println(team + " - " + p.getName() + " - " + p.getRuns() + " runs");
				}
			}
		}

		// Task 23: Players with at least 10 wickets
		System.out.println("\n23. PLAYERS WITH AT LEAST 10 WICKETS");
		for (String team : allIplTeamsMap.keySet()) {
			for (Player p : allIplTeamsMap.get(team)) {
				if (p.getWickets() >= 10) {
					System.out.println(team + " - " + p.getName() + " - " + p.getWickets() + " wickets");
				}
			}
		}
	}
}

 