import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Loops {
    public static void main(String[] args) {
        String word = "aaabbcccgggggg";
        char[] wordArray = word.toCharArray();
        int amount = 1;
        List amountArray = new ArrayList<>();
        List lettersArray = new ArrayList<>();
        for(int i=1; i<wordArray.length; i++){
            if(word.charAt(i)==word.charAt(i-1)){
                amount++;
            }
            else{
                amountArray.add(amount);
                lettersArray.add(word.charAt(i-1));
                amount = 1;
            }
        }
        amountArray.add(amount);
        lettersArray.add(word.charAt(wordArray.length-1));
        String result = "";
        for(int i=0; i<amountArray.size(); i++){
            result+=(""+lettersArray.get(i)+""+amountArray.get(i));
        }
        System.out.println();
        System.out.println(result);
    }
} {
    
}
