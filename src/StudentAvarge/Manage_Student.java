package StudentAvarge;

public class Manage_Student {
    public static void main(String[] args) {
        Teacher clasteacher = new Teacher("Grhambell","0000","KMY");
        Teacher matTeacher = new Teacher("Edison","00000","MAT");
        Teacher fzkTeacher = new Teacher("Nicola Tesla","000","FZK");

        Course kimya = new Course("Kimya","101","KMY");
        kimya.addTeacher(clasteacher);

        Course mat = new Course("Matematik","101","MAT");
        mat.addTeacher(matTeacher);

        Course fzk = new Course("Fizik","101","FZK");
        fzk.addTeacher(fzkTeacher);


        Student st1 = new Student("Veli","10","3",kimya,fzk,mat);
        st1.addBulExamNote(100,90,10);
        //st1.printNote();
        st1.isPass();



    }
}
