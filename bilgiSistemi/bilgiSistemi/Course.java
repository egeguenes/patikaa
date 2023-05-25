package bilgiSistemi;

public class Course{

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        } else {
            System.out.println("Hata! Prefix ve Branch uyumsuz.");
        }
        this.teacher = teacher;
    }
	void printTeacherInfo(){
        this.teacher.print();
    }
}
