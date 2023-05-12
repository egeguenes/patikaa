import java.util.Scanner;

public class Cift{
	public static void main(String[] args){
		int a, b;
		System.out.println("Sayi giriniz : ");
		Scanner ant = new Scanner(System.in);
		a = ant.nextInt();
		for (int c = 0; a>c; c++) {
			b = c%2;
			if (b == 0){
				System.out.println(c);
			} else {
				continue;
			}
		} 
	} 
}