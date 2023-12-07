import java.util.Scanner;
public class B{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi, toplam;
		toplam = 0;
		do {
			System.out.println("Sayi veriniz : ");
			sayi = scan.nextInt();
			if (sayi%2 == 0 || sayi%4 == 0){
				toplam += sayi;
			}
		} while (sayi%2 == 0);
		System.out.println("Sayilarinizin toplami : " + toplam);
	}
}