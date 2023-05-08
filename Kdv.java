import java.util.Scanner;

public class Kdv {
  public static void main(String [] args){
    double tutar;
    Scanner input = new Scanner(System.in);
    System.out.println("Urun tutarini giriniz : ");
    tutar = input.nextDouble();
    if (tutar >= 1000) {
      tutar = tutar + (tutar * 0.08);
    } else {
      tutar = tutar + (tutar * 0.18);
    } System.out.println("Tutar -> " + tutar);
  }
}
