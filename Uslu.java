import java.util.Scanner;

public class Uslu{
	public static void main(String[] args) {
		int n,k, output, i;
		Scanner ant = new Scanner(System.in);
		System.out.println("Taban giriniz : ");
		n = ant.nextInt();
		System.out.println("Us giriniz : ");
		k = ant.nextInt();
		i = k;
		for (output = 1; k>0; --k){
			output *= n;
		} System.out.println(n + " ussu " + i + " isleminin sonucu : " + output);
		/*int taban, us, sonuc;
		Scanner input = new Scanner(System.in);
		System.out.println("Taban gir : ");
		taban = input.nextInt();
		System.out.println("Ussunu gir : ");
		us = input.nextInt();
		sonuc = 1;
		while (us>0) {
			sonuc *= taban;
			--us;
		} System.out.println("Sonuc : " + sonuc);
		*/ 
	}
}