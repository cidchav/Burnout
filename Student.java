package q2aa2_tau_chavez_sevilla;
import java.util.ArrayList;

public class Student extends Person {
    private String section;
    private ArrayList<Homework> HWList;
    
    public Student(String name, Location location, String dialogue, String section){
        super(name, location, dialogue);
        this.section = section;
    }
    
    public String getSection() {
        return section;
    }

    public ArrayList<Homework> getHWList() {
        return HWList;
    }

    
    public void accomplishHomework(String name, int hours){
        for(int i = 0; i<getHWList().size(); i++){
            Homework currentHW = getHWList().get(i);
            if(currentHW.getName().equals(name)){
                currentHW.setFinished(true);
                currentHW.setHours(hours);
                
                System.out.println("You finished "+name
                        +" and got a score of "
                        +currentHW.calculateScore()+".");
                break;
            }
            //POSSIBLE EXCEPTION THROWING HERE
        }
    }
    
    public void study(int hours){
        System.out.println(name+" studied for "+hours+" hours.");
    }
    
    public void takeTest(Test test){
        System.out.println(name+" took a test in "+test.getSubject()+".");
        test.setFinished(true);
    }
    
    
     
    /*
    Has a section
    Has requirements
    Has a list of homework
    Can accomplish requirements
    Can study
    Can take tests
    */

}
