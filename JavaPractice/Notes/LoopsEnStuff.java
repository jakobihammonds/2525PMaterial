public class LoopsEnStuff {
    public static void main(String[] args) {
        //two main loops to tackle... pretty much anything          FOR and WHILE
        //both loops are built from a conditional statement

        /*          Python
                while(boolean statement == true):
                    do this algorithm

                for i in range(len(list)):
                    do this algorithm
         */

        ////////////////////            WHILE LOOPS         ////////////////////////////
        //  iterator variable
        //  while(condition is true){
                // do this algorithm
                // iterate your iterator variable
        // }

        //print out 0-9
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        //print out 0-9 a different way... aka change your conditional statement
        int j = 0;
        while (j <= 9) {
            System.out.println(j);
            j++;
        }
        //print out even numbers btwn 0-20
        int f = 0; 
        while (f<20){
            f+=2;
            System.out.println(f);
        }
        //print out prime numbers btwn 0-1,000
        i =1;
        int n=1;
        boolean isPrime= true;
        while(i<1000){
            n=2;
            isPrime= true;
            while(n<i){
                if((i% n) == 0){            //% is modulo which returns the remainder of a division
                    isPrime=false;
                }
                n++;
            }
            if(isPrime){
                System.out.println(""+i);
            }
            i++;
        }
        //print out the palindromes btwn 0-10,000
        int h = 0;
        while(h<=10000){
            String numbStr = Integer.toString(h);
            StringBuilder sb = new StringBuilder(numbStr);
            String reversedStr = sb.reverse().toString();
            if (numbStr.equals(reversedStr)){
                System.out.println(h);
            }
            h++;
        }

        //print out 1000 to -1000 by 50
        int g = 1000;
        while(g > -1050){
            System.out.println(g);
            g-=50;
        }
        //print out the alphabet (lower or upper, your choice)
        char k = 'A';
        while (k <= 'Z'){
            System.out.println(k++);
        };




    }
}