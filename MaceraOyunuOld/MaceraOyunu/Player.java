import java.util.Scanner;

public class Player {

	private int damage;
	private int health;
	private int money;
	private String name;
	private String charName;
	private GameCharacter gameChar;
	private Scanner scan = new Scanner(System.in);
	private Inventory inventory;


	Player(String name) {
		this.name = name;
		this.inventory = new Inventory();
	}

	public void selectChar() {
		GameCharacter[] gc = {new Samurai(), new Archer() , new Knight()};
		System.out.println("Such dir einen Character aus : ");
		System.out.println("---------------------------------------");
		for (int i=0; i<gc.length; i++) {
			System.out.println("Character -> " + "ID : " + gc[i].getID() + " / Name : "+ gc[i].getName() + " / Damage : " + gc[i].getDamage() + " / Health : " + gc[i].getHealth() + " / Money : " + gc[i].getMoney());
			System.out.println("---------------------------------------");
		}
		int selectChar = scan.nextInt();
		switch (selectChar) {
			case 1 :
				initPlayer(new Samurai());
				break;
			case 2 :
				initPlayer(new Archer());
				break;
			case 3 : 
				initPlayer(new Knight());
				break;
			default : 
				throw new IllegalArgumentException("Invalid Index");
		} 
		//System.out.println("Der Character wurde ausgesucht -> " + this.getCharName() + " Damage : " + this.getDamage() + " Health : " + this.getHealth() + " Money : " + this.getMoney());
	}

	public void initPlayer(GameCharacter gameChar) {
		this.setDamage(gameChar.getDamage());
		this.setHealth(gameChar.getHealth());
		this.setMoney(gameChar.getMoney());
		this.setCharName(gameChar.getName());
	}


	public void printInfo() {
		System.out.println("Aktuelle --> <Waffe : " + this.getInventory().getWeapon().getName() + " - Armor : " + this.getInventory().getArmor().getName() +  
			"> Character : " + this.getCharName() + ", Damage : " + this.getTotalDamage() + 
			", Health : " + this.getHealth() + ", Money : " + this.getMoney());
	}

	public int getTotalDamage() {
		return damage + this.getInventory().getWeapon().getDamage();
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInvntory(Inventory inventory) {
		this.inventory = inventory;
	}

	public String getWeaponName() {
		return this.getInventory().getWeapon().getName();
	}

	public String getArmorName() {
		return this.getInventory().getArmor().getName();
	}

	public int getArmorBlock() {
		return this.getInventory().getArmor().getBlock();
	}

	public GameCharacter getGameChar() {
		return gameChar;
	}

}