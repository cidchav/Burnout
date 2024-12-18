package q2aa2_tau_chavez_sevilla;

public class Test extends Requirement {
    public Test(String name, String subject, int maxScore){
        super(name,subject,maxScore);
        score = 0;
    }
    
    @Override
    public int calculateScore(){
        score = (int)(Math.random()*maxScore); //this is for non-player students
        return score;
    }

}
