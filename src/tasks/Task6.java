package tasks;

import java.util.Scanner;

public class Task6 {
    public static void problem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter the power: ");
        int num2 = sc.nextInt();
        double startTime = System.nanoTime();
        int result = power(num1, num2);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Number in this power is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    public static int power(int a, int n){
        // Any number to the power of 0 is 1
        if (n == 0)
            return 1;
        // Recursively multiplying number
        return a * power(a, n-1);
    }
}
