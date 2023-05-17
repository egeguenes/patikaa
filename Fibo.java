import java.util.Scanner;

public class Fibo{
	public static void main(String[] args){
		Scanner ant = new Scanner(System.in);
		int a, b, next, element;
		a = 0;
		b = 1;
		System.out.println("Kaçıncı elemana kadar diziyi görmek istersiniz?");
		element = ant.nextInt();
		System.out.print(a + ", " + b + ", ");
		for (int i=1; i<=element-2; i++){
			next= a+b;
			System.out.print(next + ", "); // 0, 1, next(1), 
			a = b;
			b = next; 
		}
	}
}