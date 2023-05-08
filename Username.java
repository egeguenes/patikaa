import java.util.Scanner;

public class Username{
	public static void main(String[] args) {
		String username, passwort, antwort, neuesPasswort;
		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie Ihren Usernamen ein : ");
		username = input.next();
		System.out.println("Geben Sie Ihr Passwort ein : ");
		passwort = input.next();
		// password == 123456
		if (passwort.equals("123456")){
			System.out.println("Sie haben erfolgreich eingeloggt!");
		} else{
			System.out.println("Fasclhes Passwort! Möchten Sie Ihr Passwort erneuern??");
			antwort = input.next();
			if (antwort.equals("ja")){
				System.out.println("Geben Sie ein neues Passwort ein!");
				neuesPasswort = input.next();
				if (neuesPasswort.equals("123456")){
					System.out.println("Fehler! Sie haben dasselbe Passwort eingegeben!");
				} else {
					System.out.println("Passwort wurde erfolgreich geaendert!");
				}
			} else {
				System.out.println("Sie haben nicht einloggen können.");
			}
 			
		}
	}
}