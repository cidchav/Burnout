package q2aa_tau_chavez_sevilla;

public class Sibling extends FamilyMember{
    public Sibling(String name, Location location, String dialogue){
        super(name, location, dialogue);
    }
    
    public void playGames(Player player, int hours){
        super.replenish(player, "emotional", hours+2);
        System.out.println("You played games with "+name+".");
    }
}
