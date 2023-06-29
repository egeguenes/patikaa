import java.util.Scanner; 

public class Game {

	private Player player;
	private String nickname;
	//private Location location;
	private Scanner scan = new Scanner(System.in);

	public void start() {
		System.out.println("Herzlich Wilkommen an dieses neue Adventure Spiel :)");
		Player player = new Player(nickname);
		player.selectChar();

		Location location = null;
		while (true) {
			player.printInfo();
			System.out.println("################################");
			System.out.println("Lokationen : \n" +  "0-Raus auf dem Spiel\n" + 
													"1- Safe House --> Health \n" + 
													"2-Store --> Waffen \n" + 
													"3-Cave --> Zombies // Award : Food of the Giants" + "\n" + 
													"4-Dark Forest --> Vampiren // Award : Firewood" + "\n" + 
													"5-River --> Baere // Award : Water of Life" + "\n");
			System.out.println("In welches willst du denn : ");
			int selectLoc = scan.nextInt();
			switch (selectLoc) {
				case 0 :
					location = null;
					break;
				case 1 :
					location = new SafeHouse(player);
					player.setHealth(player.getGameChar().getDefaultHealth());
					break;
				case 2 :
					location = new Store(player);
					break;
				case 3 : 
					location = new Cave(player);
					break;
				case 4 :
					location = new DarkForest(player);
					break;
				case 5 : 
					location = new River(player);
					break;
				default : 
					System.out.println("Ungültige Index!");
			}
			if (location == null) {
				System.out.println("Schon aufgegeben, HAHAH du LOSER!!!");
				break;
			}
			System.out.println();
			if (!location.onLocation()) {
				System.out.println("GAME OVER!");
				break;
			}
		}
	}

}