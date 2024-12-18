package q2aa2_tau_chavez_sevilla;

public class NonPlayableStudent extends Student {
    public NonPlayableStudent(String name, Location location, String dialogue, String section){
        super(name,location,dialogue,section);
    }
}

/*
This class was created so that the Student fields 
could be protected and not private only to the class itself.
*/
