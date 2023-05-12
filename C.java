import java.util.Scanner;

public class C{
	public static void main(String[] args) {
		int girdi, i;
		Scanner ant = new Scanner(System.in);
		System.out.println("Sayi giriniz : ");
		girdi = ant.nextInt();
		System.out.println("Dortlu muhabbet : ");
		for (i = 1; girdi >= i; i*=4){
			System.out.println(i);
		} System.out.println("Besli muhabbet : ");
		for (i = 1; girdi >=i; i *=5){
			System.out.println(i);
		}




		/*int ilk, toplam, i;
		toplam = 0;
		System.out.println("Sayi giriniz : ");
		Scanner ant = new Scanner(System.in);
		ilk = ant.nextInt();
		for (i = 1; ilk >= i; i *= 2){
			System.out.println(i);
			toplam += i;
		} System.out.println("Butun sayilarin toplami : " + toplam);
		*/
		/*int ilk, toplam, i;
		Scanner ant = new Scanner(System.in);
		System.out.println("Sayi giriniz : ");
		ilk = ant.nextInt();
		toplam = 0;
		i = 1;
		while (ilk >= i){
			toplam += i;
			i *= 2;
		} System.out.println("Butun sayilarin toplami : " + toplam);
		*/
	}
}