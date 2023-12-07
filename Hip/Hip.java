import java.util.Scanner;

public class Hip{
  public static void main(String [] args) {
    int a, b;
    double c;
    Scanner girdi = new Scanner(System.in);
    System.out.println("Birinci kenari giriniz : ");
    a = girdi.nextInt();
    System.out.println("Ikinci kenari giriniz : ");
    b = girdi.nextInt();
    c = Math.sqrt((a*a) + (b*b));
    System.out.println("Hipotenus -> " + c);
  }
}
