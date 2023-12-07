public class SafeHouse extends NormalLocation {
	
	public SafeHouse(Player p) {
		super( p , "Safe House" );
	}

	@Override
	public boolean onLocation() {
		System.out.println("Jetzt bist du im Safe House !");
		System.out.println("Dein Health wird erfüllt !");
		return true;
	}
}