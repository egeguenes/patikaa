import java.util.Scanner;
public class A{
	public static void main(String[] args){
		
		Scanner ant = new Scanner(System.in);
		int girdi, toplam;
		toplam = 0;
		do {
			System.out.println("Sayi gir");
			girdi = ant.nextInt();
			if (girdi%2 == 1){
				toplam = toplam + girdi;
				System.out.println("Toplam : " + toplam);
			}

		} while (girdi > 0);
	}
}