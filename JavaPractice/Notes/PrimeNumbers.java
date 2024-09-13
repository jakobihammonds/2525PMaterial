public class PrimeNumbers {

    public static void main(String[] args) {
        // Define the range
        int start = 0;
        int end = 1000;

        // Loop through numbers from start to end
        int number = start;
        while (number <= end) {
            // Check if the current number is a prime number
            if (isPrime(number)) {
                // Print the prime number
                System.out.println(number);
            }
            // Move to the next number
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Exclude even numbers greater than 2
        }
        // Check divisibility from 3 to the square root of number
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false; // Found a divisor other than 1 and itself
            }
        }
        return true;
    