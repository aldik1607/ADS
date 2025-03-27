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
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
