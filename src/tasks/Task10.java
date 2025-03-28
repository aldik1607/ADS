package tasks;

import java.util.Scanner;

public class Task10 {
    public static void problem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("The GCD is: " + GCD(a,b));
    }
    public static int GCD(int a, int b){
        // If b becomes 0, a is the GCD
        if (b == 0) return a;
        return GCD(b, a % b);
    }


}
