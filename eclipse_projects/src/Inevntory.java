
public class Inevntory {
	
	private Weapon weapon;
	private Armor armor;
	
	public Inventory() {
		this.weapon = new Weapon( 0 , "Fists" , 0 , 0 );
		this.armor =  new Armor( 0 , "Shirt" , 0 , 0 );
	}
	
	public Weapon getWeapon() {
		return this.weapon;
	}
	
	public void setWeapon( Weapon weapon ) {
		this.weapon = weapon;
	}
	
	public Armor getArmor() {
		return this.armor;
	}
	
	public void setArmor( Armor armor ) {
		this.armor = armor;
	}	
}