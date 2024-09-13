import java.lang.*;
import java.util.Scanner;

public class SciFi {
    public static void main(String[] args){
      
      Scanner ui = new Scanner(System.in);

      System.out.println("First Name: ");
      String fname = ui.nextLine(); //get input

      System.out.println("last Name: ");
      String lname = ui.nextLine(); //get input

      System.out.println("city: ");  
      String city = ui.nextLine(); //get input

      System.out.println("school: ");  
      String school = ui.nextLine(); //get input

      System.out.println("pet or fav appetizer: ");  
      String pet = ui.nextLine(); //get input

      System.out.println("fav sibling or fav mythical character: ");  
      String sibling = ui.nextLine(); //get input
      
      //   ^
      //   | collecting data
      
      System.out.printf("\nFirst: "+fname+"\nLast: "+lname+"\nCity: "+city+"\nSchool: "+school+"\nPet/Fav App: "+pet+"\nFav Sibling or Fav Character: "+sibling);

      String SciFirstName = fname.substring(0, 2)+lname.substring(lname.length()-2);
      String SciLastName = city.substring(0, 4)+lname.substring(lname.length()-3);
      String SciOrigin = pet.substring(0, 3)+lname.substring(lname.length()-2);

      System.out.println("\n\nHowdy "+SciFirstName+" "+SciLastName+" from "+SciOrigin+".");

      ui.close();
    }
}