import java.util.Scanner;

public class Ar{
	public static void main(String[] args){
		int zahl, tempZahl, result, stellen, i, multi;
		Scanner inp = new Scanner(System.in);
		System.out.print("Geben Sie bitte die Kontrolzahl ein : ");
		zahl = inp.nextInt();
		tempZahl = zahl;
		result = 0;
		stellen = 0;
		while (tempZahl != 0){
			tempZahl/=10;
			stellen++;
		} tempZahl = zahl;
		while (tempZahl !=0){
			i = tempZahl%10;
			for (int k=1; k<=stellen; k++){
				k *=i;
			} result += i;
			tempZahl /=10;
		} System.out.println(result);
		if (result==zahl){
			System.out.println(zahl + " ist eine ArmstrongZahl. "); 
		} else{
			System.out.println(zahl + " ist keine ArmstrongZahl. ");
		}

	}
}