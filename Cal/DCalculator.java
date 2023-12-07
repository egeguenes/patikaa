import java.util.Scanner;

public class DCalculator{
	public static int summe(int n1, int n2){
		return n1 + n2;
	} 
	public static int sub(int n3, int n4){
		return n3 - n4;
	}
	public static int mul(int n5, int n6){
		return n5*n6;
	}
	public static int div(int n7, int n8){
		return n7/n8;
	}
	public static int ex(int n9, int n10){
		int result = 1;
		for(int i=1; i<=n10; i++){
			result *= n9;
		} return result;
	}
	public static int mod(int n11, int n12){
		return n11%n12;
	}
	public static int vUmfang(int n13, int n14){
		return (n13 + n14)*2;
	}
	public static int vFlache(int n15, int n16){
		return n15*n16;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int select;
		String menu = "Welche möchten Sie : \n" + "1-Addierung \n" + "2-Subtraktion\n" + "3-Multiplikation\n" + "4-Division\n" +
													"5-Exponent\n" + "6-Mudulo\n" + "7-Vierecke Umfang\n" + "8-Vierecke Flache\n" + "9-Ausloggen";
		do {
			System.out.println(menu);
			select = input.nextInt();
			if (select>=7 && select !=9){
				System.out.println("Sie haben eine Vierecke!");
			} else if (select == 9){
				System.out.println("Sie haben ausgeloggt!");
				select = 0;
				break;
			}
			System.out.println("Erste Zahl : ");
			int a = input.nextInt();
			System.out.println("Zwite Zahl : ");
			int b = input.nextInt();
			switch (select) {
				case 1:
					System.out.println("Ergebnis : " + summe(a,b));
					break;
				case 2:
					System.out.println("Ergebnis : " + sub(a,b));
					break;
				case 3:
					System.out.println("Ergebnis : " + mul(a,b));
					break;
				case 4:
					System.out.println("Ergebnis : " + div(a,b));
					break;
				case 5:
					System.out.println("Ergebnis : " + ex(a,b));
				case 6:
					System.out.println("Ergebnis : " + mod(a,b));
					break;
				case 7:
					System.out.println("Ergebnis : " + vUmfang(a,b));
					break;
				case 8:
					System.out.println("Ergebnis : " + vFlache(a,b));
					break;

			}
		} while (select!=0);

		
	}
}