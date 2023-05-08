import java.util.Scanner;

public class TurSteher {
  public static void main(String [] args) {
    System.out.println("Wie alt sind Sie?\n");
    int age = Integer.parseInt(args[0]);
    if (age >= 18) {
      System.out.println("Du kommst rein.");
    } else {
      System.out.println("Kennst du den Tuersteher, ja oder nein?\n");
      Scanner antwort = new Scanner(System.in);
      String input = antwort.next();
      if (input.equals("ja")) {
        System.out.println("Du kommst rein.");
      } else {
        System.out.println("Du kommst nicht rein.");
      } antwort.close();
    }
  }
}
