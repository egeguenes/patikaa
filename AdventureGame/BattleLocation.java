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
	public boolean Onlocation
}