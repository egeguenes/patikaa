import java.util.Random;

public abstract class BattleLocation extends Location {

	private Monster monster;
	private String award; 
	private int maxMonster;
	private Random rnd = new Random();

	public BattleLocation( Player player , String locationName , Monster monster , String award , int maxMonster ){
		super(player , locationName);
		this.monster = monster;
		this.award = award;
		this.maxMonster = maxMonster;
	}

	@Override
	public boolean onLocation() {
		int randomMonsterNumber = this.getRandomMonsterNumber();
		System.out.println("Aktuelle Lokation : " + this.getLocationName());
		System.out.println("Sei vorsichtig in diesem schrecklichen " + this.getLocationName() + ". Hier befinden sich " + randomMonsterNumber +
							 " " + this.getMonster().getName() + "!");
		System.out.println("Nach dem Kampf bekommst du " + this.getAward() + "!");
		System.out.print("<K>ampf mit denen oder <F>liehen ? ");
		String selectCase = scan.nextLine();
		selectCase = selectCase.toUpperCase();	

		if (selectCase.equals("K")) {
			// Fight
			System.out.println("Jeder muss fürs Leben kaempfen!");
			if ( combat(randomMonsterNumber) ) {
				System.out.println("Alle Feinde im " + this.getLocationName() + " wurden getötet!");
				return true;
			}

		} else if (selectCase.equals("F")) {
			//Fliehen
			System.out.println("Flieh! Du, Feigling!");
		} else {
			System.out.println("Unsere Entscheidungen praegen uns! Enthsceid dich doch!");
		}
		
		if (this.getPlayer().getHealth() <= 0) {
			System.out.println("Du wurdest umgebracht! LOSER!");
			return false;
		}
		return true;
	}

	public boolean combat(int randomMonsterNumber) {
		for (int i=0; i<randomMonsterNumber; i++) {
			this.getMonster().setHealth(this.getMonster().getDefaultHealth());
			playerStats();
			System.out.println("#################");
			monsterStats();
			while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
				System.out.print("<S>chlagen oder <F>liehen : ");
				String selectCombat = scan.nextLine().toUpperCase();
				if (selectCombat.equals("S")) {
					System.out.println("Ein schneller Schlag!");
					this.getMonster().setHealth( this.getMonster().getHealth() - this.getPlayer().getTotalDamage() );
					afterHit();
					if (this.getMonster().getHealth() > 0) {
						System.out.println();
						System.out.println(this.getMonster().getName() + " hat dich geschlagen!");
						int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getArmorBlock();
						if (monsterDamage > 0) {
							this.getPlayer().setHealth( this.getPlayer().getHealth() - monsterDamage );
						}
						afterHit();							
					}
				}

			}
		}
		return false;
	}

	public void playerStats() {
		System.out.println("Player stats : ");
		System.out.println("--------------------------");
		System.out.println("Health : " + this.getPlayer().getHealth());
		System.out.println("Waffe  : " + this.getPlayer().getWeaponName());
		System.out.println("Damage : " + this.getPlayer().getTotalDamage());
		System.out.println("Armor  : " + this.getPlayer().getArmorName());
		System.out.println("Block  : " + this.getPlayer().getInventory().getArmor().getBlock());
		System.out.println("Money  : " + this.getPlayer().getMoney());
	}

	public void monsterStats() {
		System.out.println(this.getMonster().getName() + " Stats : ");
		System.out.println("--------------------------");
		System.out.println("Health : " + this.getMonster().getHealth());
		System.out.println("Damage : " + this.getMonster().getDamage());
		System.out.println("Award  : " + this.getMonster().getAward()); 
	}

	public void afterHit() {
		System.out.println("Dein Health : " + this.getPlayer().getHealth());
		System.out.println("Health von " + this.getMonster().getName() + ": " + this.getMonster().getHealth());
	}

	public int getRandomMonsterNumber() {
		return rnd.nextInt(this.getMaxMonster()) + 1;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public int getMaxMonster() {
		return maxMonster;
	}

	public void setMaxMonster(int maxMonster) {
		this.maxMonster = maxMonster;
	} 
}