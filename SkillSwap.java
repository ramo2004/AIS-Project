import java.util.*;

public class SkillSwap {
  
  
  public static void main(String[] args) { 
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("\nWelcome to SkillSwap!");
    System.out.print("\n\nEnter your full name: ");
    
    String firstName = scnr.next();
    String lastName = scnr.next();
    
    System.out.print("\nWhat are you looking to learn today " + firstName + "?");
    
    String userLearns = scnr.next();
    
    System.out.print("\nWhat is something you could potentially teach to another person?: ");
    
    String userTeaches = scnr.next();
    
    String[][] myArray = {
    
    {"Henry", "Doe", "Calculus"},
    {"Jane", "Doe", "Biology"},
    {"Bob", "Smith", "Chemistry"} 
      
    };
    
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        if(userLearns.equals(myArray[i][j])){
          System.out.println("You matched with " + myArray[i][j - 2] + " " + myArray[i][j - 1]);
        }
      }
     }
  }
  
}
