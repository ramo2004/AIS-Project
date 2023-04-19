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
    
    System.out.println("Searching...");
    
    String[][] myArray = {
    
    {"Henry", "Doe", "Math", "Spanish"},
    {"Jane", "Allison", "Biology", "Coding"},
    {"Bob", "Smith", "Chemistry", "Physics"},
    {"Mary", "Jane", "English", "Arts"}, 
    {"Jack", "Ryan", "Math", "Chemistry"},
    {"Paul", "Peters", "Spanish", "Biology"},
    {"John", "Cooper", "Arts", "Coding"},
    {"Bob", "Smith", "Chemistry", "Physics"}, 
    {"Sarah", "Hannah", "Physics", "English"},
    {"Courtney", "Garza", "Biology", "Math"}
      
    };
    
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 4; j++){
        if(userLearns.equals(myArray[i][j])){
          System.out.println(myArray[i][j - 2] + " " + myArray[i][j - 1] + " can teach you " + myArray[i][j]);
        }
        
      }
     }
    
    for (int i = 0; i < 10; i++) {
    for (int j = 1; j < 5; j++) {
        if (userTeaches.equals(myArray[i][2])) {
            System.out.println("You can teach " + myArray[i][j-1]);
        }
    }
}



      }
     }
    
    
  
  

