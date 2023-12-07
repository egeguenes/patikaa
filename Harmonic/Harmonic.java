import java.util.Scanner;

public class Harmonic{
	public static void main(String[] args){
		int n;
		double b, summe;
		Scanner ant = new Scanner(System.in);
		System.out.println("Geben Sie eine Nummer ein : ");
		n = ant.nextInt();
		summe = 0;
		b=0;
		for (int i = 1; i<=n; i++){
			summe += 1.0/i;
		} System.out.println("Summe -> " + summe);
	}
}