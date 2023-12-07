import java.util.Scanner;

public class Ortalama{
  public static void main(String [] args){
    int mat,fizik,kimya,turkce,tarih,muzik;
    Scanner inp = new Scanner(System.in);
    System.out.print("Mat ortalaman : ");
    mat = inp.nextInt();
    System.out.print("Fizik ortalaman : ");
    fizik = inp.nextInt();
    System.out.print("Kimya ortalaman : ");
    kimya = inp.nextInt();
    System.out.print("Turkce ortalaman : ");
    turkce = inp.nextInt();
    System.out.print("Tarih ortalaman : ");
    tarih = inp.nextInt();
    System.out.print("Muzik ortalaman : ");
    muzik = inp.nextInt();
    int ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
    System.out.println("Sınav ortalamanız: " + ort);
  }
}
