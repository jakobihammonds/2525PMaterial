import java.util.Random;
import java.util.Scanner;

public class ganloop {
    public static void main(String[] args) {
        System.err.println("Play my awesome game!");
        Scanner ui = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(1,10);
        int guess = -1;
        //loopityloops
        while (guess!=answer) {

            guess = ui.nextInt();
            if (guess<answer) {
                System.out.println("Too low lol");
            }
            else if (guess>answer) {
                System.out.println("Too high lol");
            }
            else {
                System.out.println("you got it!");
            }

        }
        ui.close();
    }
}
