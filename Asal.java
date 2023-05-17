//primzahl dedektor
import java.util.Scanner;

public class Asal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Bis zu welcher Zahl soll ich Primzahlen ausgeben? ");
		int zahl1 = input.nextInt();
		for (int i=2; i<=zahl1; i++){ // Zahlen von 1 bis zahl1
			boolean ege = true;
			for (int abdul = 2; abdul<i; abdul++){
				if (i%abdul ==0){
					ege = false;
					break;
				}
			}
			if (ege){
				System.out.print(i + ", ");
			}

		}

	}
}