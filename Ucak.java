import java.util.Scanner;

public class Ucak{
	public static void main(String[] args){
		double yol, age, type, kosten;
		Scanner ant = new Scanner(System.in);
		System.out.println("Km cinsinden mesafe : ");
		yol = ant.nextInt();
		String soru = yol >= 0 ? "Yas giriniz" : "Hatali veri";
		System.out.println(soru);
		age = ant.nextInt();
		String soru1 = age>=0 ? "Yolculuk tipi belirtiniz -> 1(Tek yon)// 2(Gidis-Gelis)" : "Hatali veri";
		System.out.println(soru1);
		type = ant.nextInt();
		kosten = yol * 0.10;
		if (age<12){
			kosten = kosten/2;
		} else if(age>=12 && age<=24){
			kosten = kosten * 0.90;
		} else if(age>65){
			kosten = kosten * 0.70;
		} else {
			kosten = kosten;
		}
		if (type==2){
			kosten = 2 * kosten * 0.80; 
		System.out.println("Odenecek tutar --> " + kosten);
		} else if (type==1){
			kosten = kosten;
		System.out.println("Odenecek tutar --> " + kosten);
		} else {
			System.out.println("Hatali veri");
		}
	}
}