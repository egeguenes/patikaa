import java.util.Scanner;

public class Vki{
  public static void main(String[] args){
    double kg, boy;
    Scanner input = new Scanner(System.in);
    System.out.println("Kilonuzu giriniz : ");
    kg = input.nextDouble();
    System.out.println("Boyunuzu giriniz : ");
    boy = input.nextDouble();
    double vki = kg / ( boy * boy );
    System.out.println("Vucut kitle endeksiniz -> " + vki);
  }
}
