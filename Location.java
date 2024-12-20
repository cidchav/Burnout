package q2aa2_tau_chavez_sevilla;

import java.util.ArrayList;

public class Location implements Interactive{
    private String name, activity;
    private ArrayList<Person> peopleList;
    private static ArrayList<Location> locationList = new ArrayList<Location>();
    
    public Location(String name, String activity){
        this.name = name;
        locationList.add(this);
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

    public static ArrayList<Location> getLocationList() {
        return locationList;
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
}
