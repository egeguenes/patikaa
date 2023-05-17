import java.util.Scanner;

public class Uslu{
	public static int power(int n1, int n2){
		int result = 1;
		for (int i=1; i<=n2; i++){
			result *= n1;
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner ant = new Scanner(System.in);
		int n3, n4;
		System.out.print("Base : ");
		n3 = ant.nextInt();
		System.out.print("Power : ");
		n4 = ant.nextInt();
		int abe = power(n3, n4);
		System.out.println(abe);
	}
}
