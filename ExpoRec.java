import java.util.Scanner;

public class ExpoRec{
	public static int expo(int n1, int n2){
		if (n2==0){
			return 1;
		} else if (n2==1){
			return n1;
		} else{
			return n1*expo(n1, n2-1);
		}
	}
	public static void main(String[] args){
		boolean ege = true;
		Scanner ant = new Scanner(System.in);
		while (ege){
			int a, b;
			System.out.println("Gib die Basis ein : ");
			a = ant.nextInt();
			System.out.println("Gib das Exponent ein : ");
			b = ant.nextInt();
			System.out.println("Das Ergebnis ist -> " + expo(a, b));
			System.out.println("Wollen Sie die App noch anwenden? J/N");
		String cont = ant.next();

		if (cont.equalsIgnoreCase("N")){
			ege = false;
		}

		}
		

	}
}