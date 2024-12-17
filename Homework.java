package q2aa_tau_chavez_sevilla;

public class Homework extends Requirement {
    int hours, maxHours;
    
    public Homework(String name, String subject, int maxScore, int maxHours){
        super(name,subject,maxScore);
        this.maxHours = maxHours;
        
        hours = 0;
        score = 0;
    }
    
    public int getHours() {
        return hours;
    }

    public int getMaxHours() {
        return maxHours;
    }
    
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    @Override
    public int calculateScore(){
       score = (int)(hours/getMaxHours())*getMaxScore();
       return getScore();
    }
}
