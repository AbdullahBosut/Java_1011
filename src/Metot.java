public class Metot {
    static int sum(int a,int b){
        return a+b;
    }
    static void show()
    {
        System.out.println("Show metodu..");
        return;
    }
    static void number(int x, int z) {
        int y = 2;
        x = x * y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum(10,20));
        show();
        int y = 3;
        int z = 2;
        if (y != z) {
            int x = 20;
        }
        int x = 50;
        number(x, z);
    }



}
