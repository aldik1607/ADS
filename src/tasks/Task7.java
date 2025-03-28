package tasks;

import java.util.Scanner;

public class Task7 {
    public static void problem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Please enter elements of the array: ");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        reversedArray(arr, num -1);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
    public static void reversedArray(int[] arr, int index){
        // If index is out of bounds, return
        if (index < 0)
            return;
        // Print the current element
        System.out.print(arr[index] + " ");
        // Recursively call for the previous index
        reversedArray(arr, index - 1);
    }

}
