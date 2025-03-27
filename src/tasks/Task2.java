package tasks;

import java.util.Scanner;

public class Task2 {
    public static void problem() {
        double startTime = System.nanoTime();
        double result = findAverage();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Average is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    public static double findAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Please enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = sum / n;
        return avg;
    }
}