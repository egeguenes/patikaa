import java.util.Scanner;

public class Order{
	public static void main(String[] args){
		int a,b,c;
		Scanner ant = new Scanner(System.in);
		System.out.println("Ilk sayi aa");
		a = ant.nextInt();
		System.out.println("Ikinci sayi bb");
		b = ant.nextInt();
		System.out.println("Ucuncu sayi cc");
		c = ant.nextInt();
		if (a<b && c<b){
			if (a<c){
				System.out.println("a<c<b");
			} else {
				System.out.println("c<a<b");
			}
		} else if (a<c && b<c){
			if (a<b){
				System.out.println("a<b<c");
			} else {
				System.out.println("b<a<c");
			}
		} else {
			if (c<b){
				System.out.println("c<b<a");
			} else {
				System.out.println("b<c<a");
			}
		}
	}
}