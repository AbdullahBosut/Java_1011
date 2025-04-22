import java.util.Scanner;

public class Calculator_Two {
    static int sum(int a, int b){
        return a+b;
    }
    static int minus(int a,int b){
        int result = a-b;
        System.out.println("Çıkarma: "+result);
        return result;
    }
    static int times(int a,int b){
        int result = a*b;
        System.out.println("Çarpım: "+result);
        return result;
    }
    static int divied(int a,int b){
        if (b == 0){
            System.out.println("Bölen Sıfır Olamaz");
            return 0;
        }
        int result = a/b;
        System.out.println("Bölümü: "+result);
        return result;
    }
    static int power(int a,int b){
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a,int b){
        int result = a%b;
        return result;
    }
    static void calculate(int a,int b){
        int result = 2*(a+b);
        System.out.println("Dikdörtgenin Çevresi: "+result);
        System.out.println("Dikdörtgenin Alanı: "+ (a*b));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int select;
        String menu = "1-Toplama İşlemi\n"+
                "2-Çıkarma İşlemi\n"+
                "3-Çarpma İşlemi\n"+
                "4-Bölme İşlemi\n"+
                "5-Üslü Sayı Hesaplama\n"+
                "6-Mod Alma\n"+
                "7-Dikdörtgen Alan ve Çevre Hesabı\n"+
                "8-Çıkış Yap"
                ;

        System.out.println(menu);
        while (true){
            System.out.print("Bir İşlem Seçiniz: ");
            select = scn.nextInt();
            int result = 0;
            System.out.print("a sayısı: ");
            int a = scn.nextInt();
            System.out.print("b sayısı: ");
            int b = scn.nextInt();
            if (select == 0 || select == 8){
                break;
            }
            switch (select){
                case 1:
                    result = sum(a,b);
                    System.out.println("Toplam: "+result);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divied(a,b);
                    break;
                case 5:
                    System.out.println("sonuç: "+power(a,b));
                    break;
                case 6:
                    System.out.println("mod işlemi: "+mod(a,b));
                    break;
                case 7:
                    calculate(a,b);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz!!!");
                    break;
            }
        }








    }

}
