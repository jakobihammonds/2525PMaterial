//package
//import
import java.util.Scanner;
//ALWAYS REMEMBER - public class filename without the extension
public class HelloScanner {
    public static void main(String[] args){
        System.out.println("What's for lunch?");
        //food=input("question?")

        //any time I need user input... do this...
        Scanner ui = new Scanner(System.in);
        String food = ui.nextLine();    //get the next line of input from the user

        System.out.println("Wow! "+food+" sounds Delish!");

        System.out.println("How much was it? ");
        double cost = ui.nextDouble();
        System.out.println("Wow! "+cost+" seems pretty cheap");

        System.out.println("How many "+food+" did you get?");
        double amount = ui.nextDouble();
        System.out.println("Wow! "+amount+" seems like a lot!?");
        System.out.println("That is like "+cost/amount+" per "+food+"!");
        
        ui.close();   //best practice

     }    
}
