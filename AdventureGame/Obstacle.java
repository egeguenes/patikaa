public abstract class Obstacle {
	
	private int obstacleID;
	private String obstacleName;
	private int obstacleDamage;
	private int defaultHP;
	private int currentHP;
	private int award;

	public Obstacle( int obstacleID , String obstacleName , int obstacleDamage , int currentHP , int award ) {
		this.obstacleID = obstacleID;
		this.obstacleName = obstacleName;
		this.obstacleDamage = obstacleDamage;
		this.currentHP = currentHP;
		this.defaultHP = currentHP;
		this.award = award;
	}

	public int getObstacleID() {
		return obstacleID;
	}

	public void setObstacleID(int obstacleID) {
		this.obstacleID = obstacleID;
	}

	public String getObstacleName() {
		return obstacleName;
	}

	public void setObstacleName(String obstacleName) {
		this.obstacleName = obstacleName;
	}

	public int obstacleDamage() {
		return obstacleDamage;
	}

	public void setObstacleDamage(int obstacleDamage) {
		this.obstacleDamage = obstacleDamage
	}

	public int getDefaultHP() {
		return defaultHP;
	}

	public void setDefaultHP(int defaultHP) {
		this.defaultHP = defaultHP;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public int getAward() {
		return award;
	}

	public void setAward(int award) {
		this.award = award
	}
}