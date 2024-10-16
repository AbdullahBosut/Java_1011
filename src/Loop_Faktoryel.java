import java.util.Scanner;

public class Loop_Faktoryel {
    public static void main(String[] args) {
        int n,r,m,nfaktoryel=1,rfaktoryel=1,mfaktoryel=1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Eleman Sayısı: ");
        n = scn.nextInt();
        System.out.print("Seçim Sayısı: ");
        r = scn.nextInt();
        m = (n-r);

        if (r<=n){
            for (int i = 1; i<=n; i++){
                nfaktoryel = nfaktoryel*i;
            }
            //System.out.println(nfaktoryel);
            for (int i = 1; i<=r; i++){
                rfaktoryel = rfaktoryel*i;
            }
            //System.out.println(rfaktoryel);
            for (int i = 1; i<=m; i++){
                mfaktoryel = mfaktoryel*i;
            }
            //System.out.println(mfaktoryel);
        }else {
            System.out.println("Hatalı Girdiniz.");
        }
        System.out.println("Kombinasyon: "+(nfaktoryel/(rfaktoryel*mfaktoryel)));






    }

    
}
