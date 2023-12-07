import java.util.Scanner;

public class Daire{
  public static void main(String[] args){
    int r;
    double pi = 3.14;
    System.out.println("Daire yaricapi giriniz");
    Scanner inp = new Scanner(System.in);
    r = inp.nextInt();
    double alan = pi * r * r;
    double cevre = 2 * pi * r;
    System.out.println("Daire alani -> " + alan);
    System.out.println("Daire cevresi -> " + cevre);
  }
}
