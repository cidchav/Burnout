package q2aa2_tau_chavez_sevilla;

import java.util.Scanner;

public class Q2AA2_Tau_Chavez_Sevilla{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Location classroom = new Location("classroom");
        Location library = new Location("library");
        InteriorElement door = new InteriorElement("door","\nShould I go to the...");
        InteriorElement table = new InteriorElement("table","\nShould I...");
        Player player = new Player("Sean", classroom, "Shawntuah.", "Tau", "being cool", 10, 10, 10); //necessary?
        boolean inspectMatch, locationMatch;
        
        do{
            System.out.println("Should I inspect the...\n> door?\n> table?");
            String inspectInput = sc.nextLine();
            inspectMatch = false;
            
            try{
                if(door.getName().equals(inspectInput)){
                    inspectMatch = true;
                    do{
                        locationMatch = false;
                        player.inspect(door);
                        System.out.println("> classroom?");
                        System.out.println("> library?");
                        String locationInput = sc.nextLine();

                        try{
                            for(Location l : Location.locationList){
                                if(l.getName().equals(locationInput)){
                                    locationMatch = true;
                                }
                                if(locationMatch == true){
                                    break;
                                }
                            }
                            if(locationMatch == false){
                                throw new UnknownLocationException("Where is that?"); 
                            }
                        }
                        catch(UnknownLocationException unknownLocationException) {
                            System.out.println(unknownLocationException.getMessage());
                        }

                        try{
                            if(locationInput.equals(player.getLocation().getName())) {
                                locationMatch = false;
                                throw new SameLocationException("I'm already in the " + player.getLocation().getName() + ".");
                            }
                        }
                        catch(SameLocationException sameLocationException) {
                            System.out.println(sameLocationException.getMessage());
                        }

                        switch(locationInput) {
                            case "classroom":
                                player.setLocation(classroom);
                                break;    
                            case "library":
                                player.setLocation(library);
                                break;  
                        }
                    }while(locationMatch == false);
                } 
                else if(table.getName().equals(inspectInput)){
                    inspectMatch = true;
                    player.inspect(table); 
                    System.out.println("1) chow down?\n2) hit the books?\n3) catch some Z's?");
                    String actionInput = sc.nextLine();                           
                }
                else{
                    throw new UnknownInspectException("What is that?\n");
                }
            }
            catch(UnknownInspectException unknownInspectException){
                System.out.println(unknownInspectException.getMessage());
            }
        }while(inspectMatch==false);
    }   
}
