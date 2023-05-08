import java.util.Scanner;

public class Cal{
	public static void main(String[] args) {
		double n1, n2;
		Scanner input = new Scanner(System.in);
		System.out.println("ilk sayiyi gir : ");
		n1 = input.nextDouble();
		System.out.println("ikinci sayiyi gir : ");
		n2 = input.nextDouble();
		System.out.println("islemini gir : ");
		String a;
		Scanner and = new Scanner(System.in); 
		a = and.next();
		switch (a) {
			case "x":
				System.out.println(n1 * n2);
				break;
			case ":":
				System.out.println(n1 / n2);
				break;
			case "+":
				System.out.println(n1 + n2);
				break;
			case "-":
				System.out.println(n1 - n2);
				break;
			default:
				System.out.println("Hae?");
				break;
		}

	}
}