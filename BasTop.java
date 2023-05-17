import java.util.Scanner;

public class BasTop{
	public static void main(String[] args){
		int num1, b, summe;
		Scanner ant = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein : ");
		num1 = ant.nextInt();
		summe = 0;
		while(num1 != 0){
			b = num1%10;
			summe +=b;
			num1 /= 10;
		} 
		System.out.println(summe);
	}
}
