public class Recusive_Example {
    static int basamak(int sayi){
        if(sayi == 0){
            return 0;
        }else {
            return sayi % 10 + basamak(sayi / 10);
        }
    }
    static int as(int i) {
        if (i < 2) return 1;
        else return (i * as(i - 1));
    }
    public static void main(String[] args) {
        //System.out.println("Basamak toplami: "+basamak(45612));
        //System.out.println(as(3));
        recursiveMethod(4);

    }
    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }

}
