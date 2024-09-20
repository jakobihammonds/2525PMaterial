public class ArrayRay {
    public static void main(String[] args) {
        int[] listy= {1,2,3,4,5,6,7,8,9};
        double[] listy2= {1.1,2,3.14,4,5,6,7,8,9.1};
        char[] listy3= {'a','z'};
        String[] listy4= {"skibidi rizzmas","skibidi broilet"};
       
        String[] cart = new String[5];
        double[] cost= new double[5];

        System.out.println(listy);
        System.out.println(listy2);
        System.out.println(listy3);
        System.out.println(listy4);
        System.out.println(cart);
        System.out.println(cost);
        
    }

    private static void printHorizontal(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\s");
        }
        System.out.println();
    }
    private static void printHorizontal(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\s");
        }
        System.out.println();
    }
    private static void printVertical(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\s");
        }
        System.out.println();
    }
    private static void printVertical(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\s");
        }
        System.out.println();
    }
}
