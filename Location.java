package burnout;
import java.util.ArrayList;

public class Location implements Interactive {
    private String name, activity;
    private ArrayList<Person> peopleList;
    
    public Location(String name, String activity){
        this.name = name;
        this.activity = activity;
    }
    
    public String getName() {
        return name;
    }

    public String getActivity() {
        return activity;
    }

    public ArrayList<Person> getPeopleList() {
        return peopleList;
    }
    
    public void addPerson(Person person){
        getPeopleList().add(person);
    }
    
    public void removePerson(Person person){
        getPeopleList().remove(person);
    }
    
    @Override
    public void interact(){
        System.out.println("The activity here is "+activity+".");
    }
    
    /*
    Has a name
    Has a special activity
    Has list of people
    Is interactive
    */

}
