//The class name MUST match the name of your file
/*
 *  public -> Anyone (in this file's scope) can interact with it!
 *  class -> type of file -> Group of Objects -> What will be compiled
 *  Hello -> Filename and again, spelled the exact same way as the file...
 */
public class Hello {
    // print('Hello World')

    /*
     * public -> Anyone (in this file's scope) can interact with it!
     * static -> doesn't move - unchanging... kind of... or doesn't need an object
     * void -> empty or null -> does not return anything
     * main(String[] args) -> main or starting f() that needs an 
     *                             array of strings, we call it args
     */
    public static void main(String[] args){
        /* 
            System -> System module to handle objects and f() that deal with the sys
            out -> subclass that deals with output of information
            println() -> print with a new line at the end of the data
         */
        System.out.println("Hello World");

        //print("Hello World",end="\n")
        System.out.print("Another print statement+\n");
        /*
         * Escape Characters basically a special character
         * \n -> new line
         * \t -> tab
         * \s -> space
         * \\ -> \
         * \" -> "
         */

        System.out.print("Hello Again");
        System.out.print("Hello Again+\n");

        //                (regex,data)
        System.out.printf("%2.2f%n",12345.6789);   
        System.out.printf("%8.2f%n",12345.6789);   
        System.out.printf("%10.2f%n",12345.6789);   
        System.out.printf("%2.0f%n",12345.6789);   
        System.out.printf("%16.2f%n",12345.6789);   
        System.out.printf("%500.2f%n",12345.6789);   

        /*
         * %#.#%l
         * first # is length of data
         * second # is rounding of data
         * l -> formatting character
         */
        
         System.out.print("string data");
         System.out.print(123456);
         System.out.print(123456.789);
         System.out.print(false);
        

    }
}
