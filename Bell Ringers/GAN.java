public class GAN {
    public static void main(String[] args) {
        int secret = 7;
        
        Scanner ui = new Scanner(System.in);
        System.out.println("Give me a number between 1 and 10");

        int ans = ui.nextInt();
        
        if(ans == secret) {
            System.out.println("You got it!");
        }
        else if (ans >= secret) {
            System.out.println("too low");
        }
        else if (ans <= secret){
            System.out.println("too high");
        }
        else() {
            System.out.println("GUESS RETARD");
        }

    
        }

    }
    
}
