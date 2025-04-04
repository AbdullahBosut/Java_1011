import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String UserName, Password;
        Scanner scn = new Scanner(System.in);
        int right = 3;
        int balance = 40000;
        int skip = 0;
        int select;
        boolean system = true;
        boolean systemoff = true;

                while (right > 0) {
                        if (systemoff) {
                            System.out.print("Kullanıcı Adınız: ");
                            UserName = scn.nextLine();
                            System.out.print("Parolanız: ");
                            Password = scn.nextLine();
                            if (UserName.equals("patika") && Password.equals("patika47")) {
                                right = -1;
                                System.out.println("Hoşgeldiniz!!");
                                system = true;
                                //System.out.println("Hesap Bakiyeniz: " + balance);
                                while (system) {
                                    System.out.println();
                                    System.out.println("1-Para Yatırma \n" + "2-Para Çekme \n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap \n");
                                    System.out.print("İşleminizi Seçiniz: ");
                                    select = scn.nextInt();
                                    System.out.println();
                                    if (select == 1){
                                        System.out.println("Bakiyeniz: "+ balance);
                                    }else if (select == 4){
                                        UserName = scn.nextLine();
                                        skip = 0;
                                        right = 3;
                                        system = false;
                                        System.out.println("ÇIKIŞ YAPILDI!!!\n"+"'SİSTEME GİRİŞ YAPMAK İÇİN KULLANICI ADI VE ŞİFRENİZİ GİRİNİZ'\n"+"SİSTEMİ KAPATMAK İÇİN ENTER TUŞUNA BASINIZ, SİSTEME TEKRAR GİRİŞ YAPMAK İÇİN HERHANGİ BİR HARFE BASINIZ");
                                        String a = scn.nextLine();
                                        if (a.isEmpty()){
                                            systemoff = false;
                                            right = -1;
                                        }else {
                                            right = 3;
                                        }
                                    }
                                }

                            } else {
                                right--;
                                System.out.println("Kullanıcı Adı Veya Şifre Yanlış!");
                                if (right == 0) {
                                    System.out.println("Hesap Bloke Edildi!!!");
                                }

                            }
                        }




                }



    }

}
