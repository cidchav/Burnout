package q2aa2_tau_chavez_sevilla;

public class FamilyMember extends Person implements SpendTimeUnlocked{
    public FamilyMember(String name, Location location, String dialogue){
        super(name, location, dialogue);
    }
    
    @Override
    public void hangOut(Player player, int hours){
        super.replenish(player, "emotional", hours+2);
    }
    
    @Override
    public void HWHelp(Player player, int hours, String HWName){
        super.replenish(player, "emotional", hours-3);
        player.accomplishHomework(HWName, hours+3);
    }
}
