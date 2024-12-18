package q2aa2_tau_chavez_sevilla;

public abstract class Item implements Interactive {
    protected String name;
    protected Location location;
    
    public Item(String name, Location location){
        this.name = name;
        this.location = location;
    }
    
    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }
    
    public abstract void act();
    //Item class will have more subclasses in the future
    
    @Override
    public void interact(){
        System.out.println("This is a "+name+".");
    }
    
   /*
    Has a name
    Can perform a special action
    Is interactive
    Has a location
    */

}
