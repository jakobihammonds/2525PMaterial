public class loopenstrings {
    public static void main(String[] args) {
        
        char c ='d';
                String s = "hjhgkdjfld;jfajskg;dskg";
                int counttoo = 0;
                for (int i = 0; i < s.length(); i++ ){
                    if (s.charAt(i) == c){
                        counttoo++;
                    }
                String inputWord = "banana";
                String vowels = "aeiouAEIOU";
                String result = "";
                for (int g = 0; i < inputWord.length(); i++) {
                char n = inputWord.charAt(g);
                if (vowels.indexOf(n) == -1) {
                 result += n;
             }
         }
         System.out.println(result);
            String original = "I like potatoes with a side of potato sauce";
            int index = original.indexOf("potato");
            System.out.println("I like potatoes with a side of potato sauce");
            Scanner ui = new Scanner(System.in);
            System.out.println("put in something: ");
        String something = ui.nextLine();
        while (index != -1) {
            original = original.substring(0, index) + something + original.substring(index + "potato".length());
            index = original.indexOf("potato", index + something.length());
        }
        System.out.println(original);
                }
                System.out.println(counttoo);
          System.out.print("01100010 01100001 01100010");
        }
}
    }
}
