package tasks;

import java.util.Scanner;

public class Task4 {
    public static void problem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        double startTime = System.nanoTime();
        int result = factorial(num);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Factorial of given number is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    public static int factorial(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}
