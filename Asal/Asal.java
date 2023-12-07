import java.util.Scanner;

public class Asal{
	public static boolean isPrime(int n){
		if (n<=1) {
			return false;
		}
		for (int i=2; i<n; i++){
			if (n%i == 0){
				return false;
			}
		} return true;
	}

	public static void main(String[] args){
		int zahl;
		if (args.length>0){
			zahl = Integer.parseInt(args[0]);
		} else {
			Scanner neu = new Scanner(System.in);
			System.out.println("Gib eine Zahl ein : ");
			zahl = neu.nextInt();
		}
		boolean result = isPrime(zahl);
		System.out.println(result ? zahl + " ist eine Primzahl" : zahl + " ist keine Primzahl");
	}
}