import java.util.Scanner;

public class Taksi {
  public static void main(String[] args){
    System.out.println("Kilometre giriniz : ");
    double km;
    Scanner girdi = new Scanner(System.in);
    km = girdi.nextDouble();
    int minUcret = 10;
    double tutar = km * 2.20;
    double tutarSon = tutar + 10;
    if (tutarSon <= 20){
      System.out.println("Ucret -> 20");
    } else {
      System.out.println("Ucret -> " + tutarSon);
    }
  }
}
