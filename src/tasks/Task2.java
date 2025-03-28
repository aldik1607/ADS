package tasks;

import java.util.Scanner;

public class Task2 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Please enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double startTime = System.nanoTime();
        double result = findAverage(arr, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Average is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    public static double findAverage(int[] arr, int n) {
        double sum = 0;
        // Finding sum of all elements
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        // Finding avg by dividing by the quantity of elements
        double avg = sum / n;
        return avg;
    }
}