import java.util.Scanner;

public class Faktor{
	public static void main(String[] args) {
		int sayi1, sayi2, ileri, ileri2, sonuc;
		Scanner ant = new Scanner(System.in);
		System.out.println("Kombinasyonun ilk elemanini girin : ");
		sayi1 = ant.nextInt();
		ileri = 1;
		ileri2 = 1;
		for (int i=1; sayi1>=i; ++i){
			ileri *= i;
		} //System.out.println(sayi1 + " sayisinin faktoru : " + ileri);
		System.out.println("Kombinasyonun ikinci elemanini girin : ");
		sayi2 = ant.nextInt();
		for (int i=1; sayi2>=i; ++i){
			ileri2 *= i;
		} sonuc = ileri / (ileri2 * (sayi1-sayi2));
		System.out.println("Kombinasyon sonucu : " + sonuc);
	}
}