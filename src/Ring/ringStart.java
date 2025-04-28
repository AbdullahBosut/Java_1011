package Ring;

public class ringStart {
    public static void main(String[] args) {
        Fighter boyka = new Fighter("Tom",20,80,80,20);
        Fighter burucelee = new Fighter("Buruce lee",10,100,100,15);

        Match match = new Match(boyka,burucelee,110,80);
        match.run();
    }
}
