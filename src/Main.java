public class Main {



    public Main() {
        System.out.printf("1");
        new Main(10);
        System.out.printf("5");
    }


    public Main(int temp) {
        System.out.printf("2");
        new Main(10, 20);
        System.out.printf("4");
    }


    public Main(int data, int temp) {
        System.out.printf("3");

    }


    public static void main(String[] args)
    {
        Main ma = new Main();
    }

}
