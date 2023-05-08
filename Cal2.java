import java.util.Scanner;

public class Cal2 {
	public static void main(String[] args) {
		double n1, n2;
		String total;
		Scanner operation = new Scanner(System.in);
		System.out.println("ilk sayi : ");
		n1 = operation.nextDouble();
		System.out.println("ikinci sayi : ");
		n2 = operation.nextDouble();
		System.out.println("islem ne : ");
		Scanner aa = new Scanner(System.in);
		total = aa.next();
		if (total.equals("x")) {
			System.out.println(n1 * n2);
		} else if (total.equals(":")) {
			System.out.println(n1 / n2);
		} else if (total.equals("+")) {
			System.out.println(n1 + n2);
		} else if (total.equals("-")) {
			System.out.println(n1 - n2);
		} else {
			System.out.println("FEHLER!");
		}

	}
}