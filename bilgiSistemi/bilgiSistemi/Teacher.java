package bilgiSistemi;

public class Teacher{

	String name;
	String mono;
	String branch;

	Teacher(String name, String mono, String branch){
		this.name = name;
		this.mono = mono;
		this.branch = branch;
	}
	void print(){
		System.out.println("Adı -> " + this.name);
		System.out.println("Telefon -> " + this.mono);
		System.out.println("Bölüm -> " + this.branch);
	}

	
}