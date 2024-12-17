package q2aa_tau_chavez_sevilla;

public class Person implements Interactive {
    protected String name, dialogue;
    protected Location location;
    
    public Person(String name, Location location, String dialogue){
        this.name = name;
        this.location = location;
        this.dialogue = dialogue;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getDialogue() {
        return dialogue;
    }
    
    //CLASS-SPECIFIC METHODS
    public void move(int xCoord, int yCoord){
        System.out.printf("%s moved by %d x and %d y.%n",name,xCoord,yCoord); //Temporary
    }
    
    public void travel(Location location){
        this.location.removePerson(this);
        this.location = location;
        location.addPerson(this);
        
    }
    
    public void use(Item item){
        System.out.println(item+" was used.");
        item.act();
    }
    
    public void replenish(Player player, String type, int HP){
       switch(type){
           case "mental": player.addMentalHP(HP); break;
           case "physical": player.addPhysicalHP(HP); break;
           case "emotional": player.addEmotionalHP(HP); break;
       }
    }
    
    @Override
    public void interact(){
        System.out.println(dialogue);
    }
    
    /*
    Has a name
    Has a location
    Has dialogue
    Can move
    Can travel
    Can use items
    Can replenish HP
    Is interactive
    */
    
}
