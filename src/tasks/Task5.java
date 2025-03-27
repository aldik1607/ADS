package tasks;

import java.util.Scanner;

public class Task5 {
    public static void problem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        double startTime = System.nanoTime();
        int result = fibonacci(num);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Fibonacci of this number is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    public static int fibonacci(int num){
        if (num  == 0)
            return 0;
        if (num == 1)
            return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
