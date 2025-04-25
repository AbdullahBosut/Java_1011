public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String Stuno;
    String classes;
    double avarge;
    boolean ispass;

    Student(String name,String Stuno,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.Stuno = Stuno;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarge = 0.0;
        this.ispass = false;
    }

    void addBulExamNote(int note1,int note2,int note3){
        if (note1 >=0 && note1 <= 100 ){
            this.c1.note = note1;
        }
        if (note2 >=0 && note2 <= 100 ){
            this.c2.note = note2;
        }
        if (note3 >=0 && note3 <= 100 ){
            this.c3.note = note3;
        }
    }
    void printNote(){
        System.out.println("Öğrencinin Adı: " + this.name);
        System.out.println("Öğrenci Numarası: " + this.Stuno);
        System.out.println("Sınıfı: " + this.classes);
        System.out.println(c1.name + " Notu: " + this.c1.note);
        System.out.println(c2.name + " Notu: " + this.c2.note);
        System.out.println(c3.name + " Notu: " + this.c3.note);
        System.out.println("Ders Ortalaması: " + this.avarge);

    }
    void isPass(){
        this.avarge = ( (this.c1.note) + (this.c2.note) + (this.c3.note) / 3.0 );
        if (this.avarge >= 50){
            System.out.println("Sınıfı Geçtiniz!!!");
        }else {
            System.out.println("Sınıf Tekrarı!!!");
        }
        printNote();

    }



}
