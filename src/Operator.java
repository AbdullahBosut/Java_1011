public class Operator {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40;
        // == Eşitlik Operatörü
        System.out.println(A==B); //Matematiksel ifademizi cümle haline getirelim. (10 Eşittir 20) bu cümle yanlış bir cümledir.10 sayısı 20 sayısına eşit olamayacağından sonucumuz yanlış yani false'tur.
                                  //Aynı cümleleri diğer matematiksel ifadelerimiz içinde yazalım.
        System.out.println(A==C); //(10 Eşittir 10 ) evet bu cümle doğru sonucumuz true.
        System.out.println(C==D); //(10 Eşittir 40 ) bu cümle yanlıştır ve cevabımız false.
        //////////////////////////////////
        // != (Eşit Değil Operatörü)
        System.out.println(A!=D); // (10 Eşit Değildir 40 ) Evet 10 sayısı 40'a eşit değildir ve sonucumuz true'dur.
        System.out.println(A!=C); // (10 Eşit Değildir 10 ) Bu cümle doğru değildir.Bu yüzden cevabımız false'tur.
        System.out.println(C!=B); // (10 Eşit Değildir 20 ) True.
        //////////////////////////////////
        // > (Büyüktür Operatörü)
        System.out.println(A>D); //// (10 Büyüktür 40 ) 10 sayısı 40 sayısından büyük değildir cümle yanlış olduğundan cevabımız false olacaktır.
        System.out.println(D>C);  // (40 Büyüktür 10) 40 sayısı 20 sayısından büyüktür,ifade doğrudur sonucumuz true'dur.
        System.out.println(C>B); //// (10 Büyüktür 20) False
        //////////////////////////////////////////////
        // >= (Büyük Eşittir Operatörü)
        System.out.println(A >= D); // (10 Büyük Eşittir 40 ) 10 sayısı 40 sayısından büyük veya eşit değildir cümle yanlış olduğundan cevabımız false olacaktır.
        System.out.println(A >= C); // (10 Büyük Eşittir 10) Burada 10 sayısı 10 sayısından büyük değildir ancak ona eşit olduğundan sonucumuz true olacaktır.
        System.out.println(C >= B) ; // (10 Büyük Eşittir 20) False
        //////////////////////////////////////////////
        // < (Küçüktür Operatörü)
        System.out.println(A < D); // (10 Küçüktür 40) 10 sayısı 40 sayısından küçük ve cümle doğrudur.Sonucumuz true.
        System.out.println(D < C); // (40 Küçüktür 10) Bu cümle yanlış olduğundan sonucumuz false olacaktır.
        System.out.println(C < B); // (10 Küçüktür 20) True
        //////////////////////////////
        //<= (Küçük Eşittir Operatörü)
        System.out.println(A <= D); // (10 Küçük eşittir 40) 10 sayısı 40 sayısından küçüktür ve cümle doğrudur.Sonucumuz true.
        System.out.println(A <= C); // (10 Küçük eşittir 10) 10 sayısı 10 sayısından küçük değildir ancak eşit olduğundan sonucumuz true.
        System.out.println(C <= B); // (10 Küçük eşittir 20) True






    }
}
