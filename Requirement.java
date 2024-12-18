package q2aa2_tau_chavez_sevilla;

public abstract class Requirement {
    protected String name, subject;
    protected int score, maxScore;
    protected boolean finished;
    
    public Requirement(String name, String subject, int maxScore){
        this.name = name;
        this.subject = subject;
        this.maxScore = maxScore;
        
        score = 0;
        finished = false;
    }
    
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public boolean isFinished() {
        return finished;
    }
    
    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    
    public abstract int calculateScore();
    
   /*
    Has a name
    Has a subject
    Has a score and maximum score
    Has a maximum number of hours to be spent on
    Has number of hours spent on
    Is either finished or unfinished
    Calculates a score
    */ 

}
