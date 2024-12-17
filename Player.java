package burnout;

public class Player extends Student {
    private String specialty;
    private int mentalHP;
    private int physicalHP;
    private int emotionalHP;
    
    public Player(String name, Location location, String dialogue, String section, 
            String specialty, int mentalHP, int physicalHP, int emotionalHP){
        super(name, location, dialogue, section);
        this.mentalHP = mentalHP;
        this.physicalHP = physicalHP;
        this.emotionalHP = emotionalHP;
    }
    
    public String getSpecialty() {
        return specialty;
    }

    public int getMentalHP() {
        return mentalHP;
    }

    public int getPhysicalHP() {
        return physicalHP;
    }

    public int getEmotionalHP() {
        return emotionalHP;
    }
    
    public int addMentalHP(int addend) {
        return mentalHP;
    }

    public int addPhysicalHP(int addend) {
        return physicalHP;
    }

    public int addEmotionalHP(int addend) {
        return emotionalHP;
    }
    
    public void inspect(Interactive interactive){
        interactive.interact();
    }
    
    @Override
    public void study(int hours){
        super.study(hours);
        mentalHP =+ hours;
    }
    
    @Override
    public void takeTest(Test test){
        super.takeTest(test);
        //INSERT CASE 3 HERE!
    }
}
