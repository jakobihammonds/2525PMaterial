import java.util.Scanner;

public class FunFunctions {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        String email = ui.nextLine();
        String username = validEmail(email);
        ui.close();
    }
    private static String validEmail(String e) {
        Scanner ui = new Scanner(System.in);
        while(!e.contains("@")){
            e=ui.nextLine();
        }
        ui.close();
        System.out.println("Hello! "+e.substring(0, e.indexOf("@")));
        return e.substring(0, e.indexOf("@"));
    }
}
