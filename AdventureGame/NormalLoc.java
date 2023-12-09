public abstract class NormalLoc extends Location {

	public NormalLoc( Player p , String locName ) {
		super( p , locName );
	}

	@Override
	public boolean onLocation() {
		return true;
	}
	
}