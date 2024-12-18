package q2aa2_tau_chavez_sevilla;

public class Parent extends FamilyMember{
    public Parent(String name, Location location, String dialogue){
        super(name, location, dialogue);
    }
    
    public void haveDeepConvo(Player player, int hours){
        super.replenish(player, "emotional", hours+4);
        System.out.println("You had a deep conversation with "+name+".");
    }
    
    public void heal(Player player){
        super.replenish(player, "physical", 3);
        System.out.println(name+" healed you.");
    }
}
