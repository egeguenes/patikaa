import java.util.Scanner;

public class Manav {
  public static void main(String[] args){
    double armut, elma, domates, muz, patlican, toplam;
    Scanner sc = new Scanner(System.in);
    System.out.println("Armut kac kilo?");
    armut = sc.nextDouble();
    System.out.println("Elma kac kilo?"); 
    elma = sc.nextDouble();
    System.out.println("Domates kac kilo?");
    domates = sc.nextDouble();
    System.out.println("Muz kac kilo?");
    muz = sc.nextDouble();
    System.out.println("Patlican kac kilo?");
    patlican = sc.nextDouble();
    toplam = (armut* 2.14)+(elma* 3.67)+(domates* 1.11)+(muz* 0.95)+(patlican* 5.00);
    System.out.println("Toplam tutariniz -> " + toplam);
      }
}