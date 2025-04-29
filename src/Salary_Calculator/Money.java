package Salary_Calculator;

public class Money {
    String name;
    double salary;
    int workhours;
    int hireyear;

    Money(String name,double salary,int workhours,int hireyear){
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireyear = hireyear;
    }

    double tax(){
        if (this.salary >= 1000){
            return this.salary * 0.03;
        }
        return 0;
    }
    double bonus(){
        if (this.workhours > 40){
            return (this.workhours-40)*30;
        }
        return 0;
    }
    double raiseSalary(){
        int u = 2021 - this.hireyear;
        if (u<10){
            return this.salary * 0.05;
        } else if (u>9 && u<20) {
            return this.salary * 0.10;
        } else if (u>19) {
            return this.salary * 0.15;
        }
        return 0;
    }
    void tString(){
        double top = ((this.salary-tax())+bonus()+raiseSalary());
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workhours);
        System.out.println("Başlangıç Yılı: " + this.hireyear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + top);
        System.out.println("Toplam Maaş: " + top);

    }




}
