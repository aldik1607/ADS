package tasks;

import java.util.Scanner;

public class Task1 {
    public static void problem() {
        double startTime = System.nanoTime();
        int result = findMin();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("Minimum is:  " + result);
        System.out.println("Time taken : " + duration + " milliseconds");
    }
    public static int findMin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
