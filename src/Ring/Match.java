package Ring;

public class Match {
    Fighter f1;
    Fighter f2;
    int maxweight;
    int minweight;
    int rouncounter = 1;

    Match(Fighter f1,Fighter f2,int maxweight,int minweight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxweight = maxweight;
        this.minweight = minweight;
    }
    void run(){
        if (isCheck()){
                while (this.f1.health >0 && this.f2.health > 0){
                    System.out.println("==== "+rouncounter+"." +"ROUND ====");
                    rouncounter++;
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin())
                        break;
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin())
                        break;
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                }


        }else {
            System.out.println("Sporcuların Sikletleri Birbirine Uymuyor!!!");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= this.minweight && this.f1.weight <= this.maxweight) && (this.f2.weight >= this.minweight && this.f2.weight <= this.maxweight);
    }
    boolean isWin(){
        if (this.f1.health == 0) {
            System.out.println(f2.name + " Kazandı!!!");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(f1.name + " Kazandı!!!");
            return true;
        }
        return false;
    }


}
