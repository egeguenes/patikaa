import java.util.Scanner;

public class Polindrom{
	public static boolean isPolindrom(){
		Scanner ant = new Scanner(System.in);
		System.out.println("Gib eine Zahl ein : ");
		int zahl = ant.nextInt();
		int tempNummer = zahl, reverse = 0, letzteStelle;
		while (tempNummer !=0){
			letzteStelle = tempNummer % 10;
			reverse = (reverse*10) + letzteStelle;
			tempNummer /= 10;
		} 
		if (zahl == reverse){
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args){
		System.out.println(isPolindrom());
		
	}
}
