public class Block{
    public static void main(String[] args) {
        int a = 15 ,b = 155;
        int i=0;

        boolean comn = a == b;
        String str = comn ? "eşit" : "eşit değil";
        //System.out.println(str);
        if (a==b){
            System.out.println("eşit");
        }else {
            System.out.println("eşitDeğil");
            System.out.println(++a);
        }

        if(i==10){
            System.out.println("i nin degeri 10'dur.");
        }
        else if(i<10){
            System.out.println("i nin degeri 10'dan kücüktür.");
        }
        else{
            System.out.println("i nin degeri 10'dan farklıdır ve 10'dan kücük degildir.");
        }
        int av = 20, bv = 10;

        if ((av < bv) && (bv++ < 25)){

            System.out.println(av);

        }else{

            System.out.print(av);

        }

        System.out.println(bv);

        int points=6;

        switch(points)

        {

            case 6: ;

            case 7: System.out.println("Java");break;

            case 8: ;

            case 9: System.out.println("101");break;

            case 10: System.out.println("Patika"); break;

            default: System.out.println("Dev");

        }



    }



}
