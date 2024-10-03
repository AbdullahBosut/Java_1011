import java.util.Scanner;

public class Kullanici_Giris {
    public static void main(String[] args) {
        String UserName,Password,PassReset = "",NewPassword = "";
        Scanner scn = new Scanner(System.in);
        System.out.print("Kullaıcı Adınızı Giriniz: ");
        UserName = scn.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        Password = scn.nextLine();

        if (!UserName.equals("Abdullah")){
            System.out.println("Kullanıcı Bulunumadı");
        }else if (UserName.equals("Abdullah")&&Password.equals("0000")){
            System.out.println("Giriş Yaptınız!");
        }else if (UserName.equals("Abdullah")&&!Password.equals("0000")){
            System.out.println("Parola Yalnış Sıfırlamak İsterseniz sıfırla Yazınız");
            System.out.println("Sfırlamak İstemiyorsanız Enter'a Basınız");
            System.out.print("Cevap: ");
            PassReset = scn.nextLine();
        }
        if (PassReset.equals("sıfırla")){
            System.out.print("Yeni Şifrenizi Giriniz: ");
            NewPassword = scn.nextLine();
            if (!NewPassword.equals("0000")){
                System.out.println("Şifre Oluşturuldu");
            }else {
                System.out.println("Şifre Oluşturulamadı,lütfen Başka Şifre Giriniz.");
            }
        }else {
            System.out.println("Giriş Yapılamadı!");
        }








    }
}
