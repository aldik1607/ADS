import tasks.Task1;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;
        while(!exit) {
            System.out.println("Enter task number: ");
            int choice = getUserChoice();
            switch(choice) {
                case 1:
                    Task1.problem();
                    break;
                    default:
                        System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
    private static int getUserChoice(){
        while(true){
            try{
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
    }
}