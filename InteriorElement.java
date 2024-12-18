package q2aa2_tau_chavez_sevilla;

import java.util.ArrayList;

public abstract class InteriorElement implements Interactive{
    protected String name, dialogue;
    private static ArrayList<InteriorElement> interiorElementList = new ArrayList<InteriorElement>();
    
    public InteriorElement(String name, String dialogue){
        this.name = name;
        this.dialogue = dialogue; 
        interiorElementList.add(this);
    }
  
    public String getName(){
        return name;
    }
    
    public ArrayList<InteriorElement> getInteriorElementList(){
        return interiorElementList;
    }
    
    public void setName(String n){
        name = n;
    }
    
    @Override
    public void interact(){
        System.out.println(dialogue);
    }
}
