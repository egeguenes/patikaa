package bilgiSistemi;
public class Main{
	public static void main(String[] args){
		Teacher t1 = new Teacher("ege" , "1231231" , "TRH");
		Teacher t2 = new Teacher("Vildan" , "1231231" , "BIO");
		Teacher t3 = new Teacher("Mehmet" , "123123" , "FZK");
		Teacher t4 = new Teacher("Patatesci" , "123123123", "PAT");

		Course tarih = new Course("Tarih" , "102" , "TRH");
		tarih.addTeacher(t1);

		Course fizik = new Course("Fizik", "101" , "FZK");
		fizik.addTeacher(t3);

		Course patates = new Course("Patates" , "101" , "PAT");
		patates.addTeacher(t4);


		Course bio = new Course("Biyoloji" , "103" , "BIO");
		bio.addTeacher(t2);

		//Student s1 = new Student("ege", "1001" , "CCC" , tarih, fizik, bio);
		//s1.addBulkExamNote(100, 89, 54);
		//s1.printNote();
		//s1.isPass();

		Student s2 = new Student("AAA" , "BBB" , "123" , bio , fizik , patates);
		s2.addBulkExamNote(31 , 18 , 99);
		s2.isPass();
		s2.printNote();

		
	}
}