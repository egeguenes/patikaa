import java.util.Scanner;

public class Burc{
	public static void main(String[] args){
		int day, month;
		System.out.println("Ay sayisi");
		Scanner inp = new Scanner(System.in);
		month = inp.nextInt();
		System.out.println("Gun sayisi");
		day = inp.nextInt();
		if (month == 3){
			if (day<=20){
				System.out.println("Balik burcu");
			} else {
				System.out.println("Koc burcu");
			} 
		} else if (month == 4){
			if (day<=20){
				System.out.println("Koc burcu");
			} else {
				System.out.println("Boga burcu");
			}
		} else if (month == 5){
			if (day<=21){
				System.out.println("Boga burcu");
			} else {
				System.out.println("Ikizler burcu");
			}
		} else if (month == 6){
			if (day<=22){
				System.out.println("Ikizler burcu");
			} else {
				System.out.println("Yengec burcu");
			}
		} else if (month == 7) {
			if (day<=22){
				System.out.println("Yengec burcu");
			} else {
				System.out.println("Aslan burcu");
			}
		} else if (month == 8){
			if (day<=22){
				System.out.println("Aslan burcu");
			} else {
				System.out.println("Basak burcu");
			}
		} else if (month == 9){
			if (day<=22){
				System.out.println("Basak burcu");
			} else {
				System.out.println("Terazi burcu");
			}
		} else if (month == 10){
			if (day<=22){
				System.out.println("Terazi burcu");
			} else{
				System.out.println("Akrep burcu");
			}
		} else if (month == 11){
			if (day<=21){
				System.out.println("Akrep burcu");
			} else {
				System.out.println("Yay burcu");
			}
		} else if (month == 12){
			if (day<=21){
				System.out.println("Yay burcu");
			} else{
				System.out.println("Oglak burcu");
			}
		} else if (month == 1){
			if (day<=21){
				System.out.println("Oglak burcu");
			} else {
				System.out.println("Kova burcu");
			}
		} else if (month == 2){
			if (day<=19){
				System.out.println("Kova burcu");
			} else{
				System.out.println("Balik burcu");
			}
		} else {
			System.out.println("Yanlis veri girildi!!!");		
		}
	}
}