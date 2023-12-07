import java.util.Scanner;

public class Ders{
	public static void main(String[] args) {
		int mat, fizik, tr, kimya, music, ort;
		double average;
		Scanner ant = new Scanner(System.in);
		System.out.println("Mat not : ");
		mat = ant.nextInt();
		System.out.println("Fizik not : ");
		fizik = ant.nextInt();
		System.out.println("Turkce not : ");
		tr = ant.nextInt();
		System.out.println("Kimya not : ");
		kimya = ant.nextInt();
		System.out.println("Muzik not : ");
		music = ant.nextInt();
		ort = 0;
		if (mat>= 0 && mat<=100){
			ort++ ;
		} else{
			mat = 0;
		}
		if (fizik>= 0 && fizik<=100){
			ort++ ;
		} else{
			fizik = 0;
		}
		if (tr>=0 && fizik<=100){
			ort++ ;
		} else{
			tr = 0;
		}
		if (kimya>=0 && kimya<=100){
			ort++ ;
		} else{
			kimya = 0;
		}
		if (music>=0 && music<=100){
			ort++ ;
		} else{
			music = 0;
		}
		average = (mat + fizik + music + kimya + tr) / ort;
		System.out.println("Ortalama not : " + average);
		if (average>= 55){
			System.out.println("Basari!");
		} else {
			System.out.println("Basarisiz!!!!!");
		}
	}
}