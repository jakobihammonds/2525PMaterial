public class StringEnStuff {
    /*
     * Data Types
     *      Primitive - initial or the first - boolean, integers, characters, double/float
     *                                          boolean, int, chr, double
     *      Non-Primitive - not native - Strings, Arrays, ArrayList, List
     * 
     *  #1 way to tell if it is a pri/non-pri is the Capitalization
     * 
     * String name = "bob";   -> name is not a var, it is an object
     * int x = 4;   -> x is now the object x
     * 
     */
    
     int x = 4;             //int is primitive
     Integer x2 = 4;         //Integer is non-primitive - this guys has methods

     double gpa = 4.0;      //This is literally a number
     Double gpa2 = 4.0;      //This can convert and check for things

     public static void main(String[] args) {
        String name = "jin";
        // char letter = "j";  " " are for strings
        char letter = 'j';  //' ' are for characters
        
        int age = 40;
        boolean old = true;
        double pi = 3.14;
        // float fpi = 3.14;    instead of float use double

        String email = "jinTheDestroyer9000@aol.com";
        String password = new String();
        password = "funpassword";

        //first I want the username - grab everything up to the @ sign
        //substring() -> grabs a sub portion of a string
        String username = email.substring(0,19);
        String domain = email.substring(20);
        System.out.println(username);
        System.out.println(domain);

        //let's find the @ symbol
        int atLoc = email.indexOf("@");   //find the string in the string obj
        username = email.substring(0, atLoc);

        //here's the email input -> jimmy.bob@evsck12.com
        //add stu. between the @ and evsck12.com
        //we want jimmy.bob@stu.evsck12.com

        String firstPart = "jimmy.bob@evsck12.com".substring(0,"jimmy.bob@evsck12.com".indexOf(("@"))+1);
        String lastPart = "jimmy.bob@evsck12.com".substring("jimmy.bob@evsck12.com".indexOf("e"));
        String corrected = firstPart+"stu."+lastPart;
        System.out.println("\n"+corrected);
        System.out.println("\n"+"jimmy.bob@evsck12.com".substring(0,"jimmy.bob@evsck12.com".indexOf(("@"))+1)+".stu"+"jimmy.bob@evsck12.com".substring("jimmy.bob@evsck12.com".indexOf("e")));

        // how long of a username do we have
        int unLength = username.length();
        System.out.printf("Your username is %n characters long\n",unLength);

        /*
         * email.contains
         * email.substring
         * email.indexOf
         * email.split
         * email.strip
         * email.reverse()      //python maybe????? //hi
         */
     }

    
}
