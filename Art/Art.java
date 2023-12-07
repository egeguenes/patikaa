import java.util.Scanner;

public class Art{
	public static void main(String[] args){
		int year;
		double year1;
		System.out.println("Yili giriniz : ");
		Scanner ant = new Scanner(System.in);
		year = ant.nextInt();
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + " artik yil.");
		} else {
			System.out.println(year + " artik yil degil");
		}
		
	}
}