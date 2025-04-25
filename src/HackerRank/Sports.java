package HackerRank;
public abstract class Sports {

    public static String getName() {
        return "Generic Sports";
    }

    static void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }


}
class Soccer extends Sports{
    public static String getName(){
        return "Soccer Class";
    }
    static void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in Soccer Class" + getName());
    }

    public static void main(String[] args) {
        System.out.println(Sports.getName());
        Sports.getNumberOfTeamMembers();
        System.out.println(getName());
        getNumberOfTeamMembers();
    }
}

