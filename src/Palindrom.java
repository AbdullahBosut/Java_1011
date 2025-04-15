public class Palindrom {
    static boolean isPolindrom(int number){
        int temp = number, reversenumber = 0,lastnumber;
        while (temp != 0){
            //System.out.println("number => " + temp);
            lastnumber = temp % 10;
            //System.out.println("End Number => " + lastnumber);
            reversenumber = (reversenumber*10) + lastnumber;
            //System.out.println("New Number => " + reversenumber);
            temp /= 10;
        }
        if (number == reversenumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPolindrom(3553));
    }
}
