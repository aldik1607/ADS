package tasks;

import java.util.Scanner;

public class Task3 {
    public static void problem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        double startTime = System.nanoTime();
        boolean result = isPrime(num);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("This number is:  " + (isPrime(num) ? "Prime" : "Composite"));
        System.out.println("Time taken: " + duration + " milliseconds");


    }
    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }
        // Checking divisibility th the square root of n because it reduces the number of iterations
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // If n is divisible by any number between 2 and square root of n, it is not prime
            if (n % i == 0) {
                return false;
            }
        }
        // If no divisors found, the number is prime
        return true;
    }
}
