import java.util.Scanner;
import java.util.Arrays;
//Vielen Dank an bakigesoglu <3
public class MaxMin{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Wie viele Nummer möchten Sie eingeben? ");
		int n = input.nextInt();
		int [] nummer = new int[n];

		for (int i=1; i<=n; i++){
			System.out.print("Geben Sie " + i + ". Nummer: ");
			nummer [i-1] = input.nextInt();
		}
		Arrays.sort(nummer);
		System.out.println("Die größte Zahl ist " + nummer[0]);
		System.out.println("Die kleinste Zahl ist " + nummer[n-1]);
	}
}