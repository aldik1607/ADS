package tasks;

import java.util.Scanner;

public class Task8 {
    public static void problem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some string: ");
        String s = sc.nextLine();
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println(isDigit(s) ? "YES" : "NO");
    }
    public static boolean isDigit(String s){
        // If string is empty, it returns true
        if (s.length() == 0) {
            return true;
        }

        // Check first character
        // If first character is not a digit, return false
        if (!Character.isDigit(s.charAt(0))) {
            return false;
        }

        // Check the rest of the string
        return isDigit(s.substring(1));
    }

}
