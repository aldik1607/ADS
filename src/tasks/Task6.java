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
        System.out.println("Fibonacci of this number is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    public static int power(int a, int n){
        int res = (int) Math.pow(a,n);
        return res;
    }
}
