package tasks;

import java.util.Scanner;

public class Task1 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double startTime = System.nanoTime();
        int result = findMin(arr, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("Minimum is:  " + result);
        System.out.println("Time taken : " + duration + " milliseconds");
    }
    public static int findMin(int[] arr, int n) {
        // Taking first element as the minimum
        int min = arr[0];
        // Checking taken min with each next element, if it smaller, min became this element
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
