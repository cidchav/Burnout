package q2aa_tau_chavez_sevilla;

public class Friend extends Student implements SpendTimeUnlocked{
    public Friend(String name, Location location, String dialogue, String section){
        super(name, location, dialogue, section);
    }
    
    @Override
    public void hangOut(Player player, int hours){
        super.replenish(player, "emotional", hours);
    }
    
    @Override
    public void HWHelp(Player player, int hours, String HWName){
        super.replenish(player, "emotional", hours-2);
        player.accomplishHomework(HWName, hours+2);
    }
}
