import java.util.Scanner;

public class Arm{
	public static void main(String[] args){

		int num1, numStellen, numTemp, a, b, result;
		Scanner input = new Scanner(System.in);
		System.out.println("Gib eine Nummer ein : ");
		num1 = input.nextInt();
		numTemp = num1;
		numStellen = 0;
		result = 0;
		while (numTemp != 0){
			numTemp /= 10;
			numStellen++;
		} 
		numTemp = num1;
		while (numTemp != 0){
			a = numTemp % 10;
			b = 1;
			for (int i = 1; i <= numStellen; i++){
				b *= a;
			}
			result += b;
			numTemp /= 10;
		} 
		System.out.println("Sayi kuvvetleri toplami " + result);
		String xxx = (num1 == result) ? "Armstrong sayidir." : "Armstrong sayi degildir.";
		System.out.println(num1 + " " + xxx);
		
	}
}