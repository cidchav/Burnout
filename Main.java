package q2aa_tau_chavez_sevilla;

public class Burnout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int time = 1;
        String period;
        
        if(time>=1 || time<=2){
            period = "Morning";
        }
        else if(time>=3 || time<=4){
            period = "Afternoon";
        }
        else if(time>=5 || time<=6){
            period = "Night";
        }
        else if(time<=7 || time>=8){
            period = "Midnight";
        }
        if(time==8){
            time = 1;
        }
        
        Location classroom = new Location("Classroom");
        Location library = new Location("Library");
        Player player = new Player("Sean", classroom, "Shawntuah.", "Tau", "being cool", 10, 10, 10);
        boolean locationMatch;
        
        do{
            locationMatch = false;
            
            System.out.println("Location: " + player.getLocation().getName());
            System.out.println("Where should I spend my time?");
            System.out.println("> Classroom");
            System.out.println("> Library");
            String locationInput = sc.nextLine();

            try {
                for (Location l : Location.locationList) {
                    if (l.getName().equals(locationInput)) {
                        locationMatch = true;
                    }
                    if(locationMatch == true){
                        break;
                    }
                }
                if(locationMatch == false){
                    throw new UnknownLocationException("That is not a location." + '\n'); 
                }
            }
            catch(UnknownLocationException ule){
                System.out.println(ule.getMessage());
            }

            try {
                if(locationInput.equals(player.getLocation().getName())){
                    locationMatch = false;
                    throw new SameLocationException("You're already in the " + player.getLocation().getName() + ".\n");
                }
            }
            catch(SameLocationException sle){
                System.out.println(sle.getMessage());
            }

            switch(locationInput){
                case "Classroom":
                    player.setLocation(classroom);
                    break;    
                case "Library":
                    player.setLocation(library);
                    break;  
            }
        }while(locationMatch == false);
    }
}
