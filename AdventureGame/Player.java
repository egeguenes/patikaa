import java.util.Scanner;

public class Player {

	private int damage;
	private int health;
	private int money;
	private Stirng name;
	private String charName;
	private GameCharacter gameChar;
	private Scanner scan = new Scanner(System.in);
	private Inventory inventory;


	public Player( String name ) {
		this.name = name;
		this.inventory = new Inventory();
	}

	public void selectChar() {
		gameCharacter[] gc = {new Samurai() , new Archer() , new Knight()};
		System.out.println("Please choose yourself a character : \n---------------------------------------");
		for ( int i = 0 ; i < gc.length ; i++ ) {
			System.out.println("Character ->" + 
				" ID : " + gc[i].getID() + 
				" / Name : "+ gc[i].getName() + 
				" / Damage : " + gc[i].getDamage() + 
				" / Health : " + gc[i].getHealth() + 
				" / Money : " + gc[i].getMoney());
			System.out.println("---------------------------------------");
		}
		int selectedCharIndex = scan.nextInt();
		swicth ( selectedCharIndex ) {
			case 1 :  
				initPlayer( new Samurai() );
				break;
			case 2 : 
				initPlayer( new Archer() );
				break;
			case 3 : 
				initPlayer( new Knight() );
				break;
			default : 
				throw new IllegalArgumentException("Invalid Index!");
		}
	}

	public void initPlayer( GameCharacter gameChar ) {
		this.setDamage( gameChar.getDamage() );
		this.setHealth( gameChar.setHealth() );
		this.setMoney( gameChar.setMoney() );
		this.setCharName( gameChar.getCharName() );
	}

	public void printInfo() {
		System.out.println("---------------------------------------");
		System.out.println("Current : Weapon : " + this.getWeaponName() + 
									"| Armor : " + this.getArmorName()  + 
								    "| Health : "+ this.getHealth()     + 
									"| Damage : "+ this.getDamage()     + 
									"| Money : " + this.getMoney());
		System.out.println("---------------------------------------");
	}

	public int getTotalDamage() {
		return this.getDamage() + this.getWeaponDamage();
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage( int damage ) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth( int health ) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney( int money ) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName( String charName) {
		this.charName = charName;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory( Inventory inventory ) {
		this.inventory = inventory
	}

	public String getWeaponName() {
		return this.getInventory().getWeapon().getName();
	}

	public int getWeaponDamage() {
		return this.getInventory().getWeapon().getDamage();
	}

	public String getArmorName() {
		return this.getInventory().getArmor().getName();
	}

	public int getArmorBlock() {
		return this.getInventory().getArmor().getBlock();
	}

	public GameCharacter getGameChar() {
		return gameChar
	}

	public void setGameChar( GameCharacter gameChar ) {
		this.gameChar = gameChar
	}
}