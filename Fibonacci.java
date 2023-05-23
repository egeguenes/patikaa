import java.util.Scanner;
public class Fibonacci{
	public static int fib(int nummer){
		if (nummer == 1 || nummer == 2){
			return 1;
		} 
		return fib(nummer-1) + fib(nummer-2);
	}
	public static void main(String[] args){
		System.out.println("Gib eine Zahl ein : ");
		Scanner ant = new Scanner(System.in);
		int a = ant.nextInt();
		System.out.println(fib(a));
	}
}