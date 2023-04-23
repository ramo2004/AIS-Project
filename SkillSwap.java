import java.util.*;

public class SkillSwap {
  
  
  public static void main(String[] args) { 
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("\nWelcome to SkillSwap!");
    System.out.print("\n\nEnter your full name: ");
    
    String firstName = scnr.next();
    String lastName = scnr.next();
    
    System.out.print("\nWhat are you looking to learn today " + firstName + "? ");
    
    String userLearns = scnr.next();
    
    System.out.print("\nWhat is something you could potentially teach to another person? ");
    
    String userTeaches = scnr.next();
    
    System.out.println("Searching...\n");
    
    String[][] myArray = {
    
    {"Henry", "Doe", "Math"},
    {"Jane", "Allison", "Biology"},
    {"Bob", "Smith", "Chemistry"},
    {"Mary", "Jane", "English"}, 
    {"Jack", "Ryan", "Math"},
    {"Paul", "Peters", "Spanish"},
    {"John", "Cooper", "Arts"},
    {"Harry", "Jones", "Chemistry"}, 
    {"Sarah", "Hannah", "Physics"},
    {"Courtney", "Garza", "Biology"}
      
    };
    
    String[][] myArray2 = {
    
    {"Henry", "Doe", "Spanish"},
    {"Jane", "Allison", "Coding"},
    {"Bob", "Smith", "Physics"},
    {"Mary", "Jane", "Arts"}, 
    {"Jack", "Ryan", "Chemistry"},
    {"Paul", "Peters", "Biology"},
    {"John", "Cooper", "Coding"},
    {"Bob", "Smith", "Physics"}, 
    {"Sarah", "Hannah", "English"},
    {"Courtney", "Garza", "Math"}
      
    };
    
    int check1 = 0;
    int check2 = 0;
    
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 3; j++){
        if(userLearns.equals(myArray[i][j])){
          System.out.println(myArray[i][j - 2] + " " + myArray[i][j - 1] + " can teach you " + myArray[i][j]);
          check1 = 1;
        }
        if(i == 9 && j == 2 && check1 == 0){
          System.out.println("No matches found for learning " + userLearns);
        }
      }
     }
    
    for (int i = 0; i < 10; i++) {
      for (int j = 1; j < 3; j++) {
        if (userTeaches.equals(myArray2[i][j])) {
            System.out.println("You can teach " + myArray2[i][j-2] + " " + myArray2[i][j-1] + " " + myArray2[i][j]);
            check2 = 1;
        }
        
        if(i == 9 && j == 2 && check2 == 0){
          System.out.println("No matches found for teaching " + userTeaches);
        }
      }
    }
    
    System.out.print("\nWho would you like to reach out to?");
    String reachOutFirst = scnr.next();
    String reachOutLast = scnr.next();
    
    System.out.println("\nYou have matched with " + reachOutFirst + " " + reachOutLast + ", send them a message!");



      }
     }
