import java.util.Random;

public abstract class BattleLocation extends Location {
	
	private Monster monster;
	private String award;
	private int maxMonster;
	private Random rnd = new Random();

	public BattleLocation( Player player , String locationName , Monster monster , String award , int maxMonster ) {
		super( player , locationName );
		this.monster = monster;
		this.award = award;
		this.maxMonster = maxMonster;
	}

	@Override
	public boolean OnLocation() {
		int randomMonsterNumber = this.getRandomMonsterNumber(); 
		System.out.println("Current Location : " + this.getLocationName());
		System.out.println("Be careful in this horrible " + this.getLocationName() + ", there are " + randomMonsterNumber + " " + this.getMonster().getName() + "!");
		System.out.println("You get " + this.getAward() + " if you clear the " + this.getLocationName() + "!");
		System.out.println("Do you want to <C>ombat , or <F>lee ?");
		String selectCase = scan.nextLine();
		selectCase = selectCase.toUpperCase();

		if ( selectCase.equals("C") ) {
			// Combat
			System.out.println("All men must combat for their lives!");
			if ( combat( randomMonsterNumber ) ) {
				System.out.println("All " + this.getMonster().getName() + "s in the " + this.getLocationName() + " are killed!");
				return true;
			}
		} else if ( selectCase.equals("F") ) {
			// Flee
			System.out.println("You have fleed, you coward!");
		} else {
			System.out.println("It's our decisions, that shape us!\nMake a decision now!");
		}

		if ( this.getPlayer().getHealth() <= 0 ) {
			System.out.println("You have died, Loser!");
			return false;
		}
		return true;
	}

	public int getMaxMonsterNumber() {
		return rnd.nextInt( this.getMaxMonster() + 1 );
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster( Monster monster ) {
		this.monster = monster;
	}

	public String getAward() {
		return award;
	}

	public void getAward( String award ) {
		this.award = award;
	}

	public int getMaxMonster() {
		return maxMonster;
	}

	public void setMaxMonster( int maxMonster ) {
		this.maxMonster = maxMonster;
	}
}