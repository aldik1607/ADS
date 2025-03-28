package tasks;

import java.util.Scanner;

public class Task9 {
    public static void problem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("Binomial coefficient is: " + binomalCoef(n,k));
    }
    public static int binomalCoef(int n, int k){
        // If k is 0 or k equals n,return 1
        if (k == 0 || k == n){
            return 1;
        }
        //C(n,k) = C(n-1,k-1) + C(n-1,k)
        return binomalCoef(n - 1, k - 1) + binomalCoef(n - 1, k);
    }
}
