import java.util.Scanner;

public class Muk{
	public static void main(String[] args){
		int zahl1, boler, result;
		result =0;
		Scanner ant = new Scanner(System.in);
		zahl1 = ant.nextInt();
		for (int i=1; i<zahl1; i++){
			if (zahl1%i==0){
				result += i;
			}
		} if (result==zahl1) {
			System.out.println(zahl1 + " bir muk sayidir.");
		} else {
			System.out.println(zahl1 + " bir muk sayi degildir.");
		}
	}
}