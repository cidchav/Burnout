package q2aa_tau_chavez_sevilla;

public class Burnout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Location classroom = new Location("Classroom");
        Location library = new Location("Library");
        Player player = new Player(10, 10, 10, classroom);
        
        System.out.println(player.getLocation().getName());
        System.out.println("Where should I spend my time?");
        System.out.println("> Classroom");
        System.out.println("> Library");
        String locationInput = sc.nextLine();
        
        switch(locationInput){
            case "Classroom":
                player.setLocation(classroom);
                break;    
            case "Library":
                player.setLocation(library);
                break;  
        }
        
        System.out.println(player.getLocation().getName());
    }
}
