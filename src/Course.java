public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }
    Course(){

    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacher();
        }else {
            System.out.println("Hoca Ve Ders Branşı Uyuşmuyor!!!");
        }
    }
    void printTeacher(){
        this.teacher.printinfo();
    }


}
