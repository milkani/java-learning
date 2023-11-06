package lv.acodemy;

import java.util.Scanner;

public class IfElseWeekSolution {
    public static void main(String[] args) {
        /*
        Write a program that accepts a number (0-6)
        as input and uses if-else statements to determine
        the corresponding day of the week (e.g., 0 is Sunday, 1 is Monday, etc.).
         */

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter day of the week (0-6): ");
        String userInput = myScanner.next();

        switch (userInput) {
            case "0":
                System.out.println("Sunday");
                break;
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("User input is not correct: " + userInput);
        }

        System.out.print("Please enter day of the week (0-6): ");
        userInput = myScanner.next();

        switch (userInput) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("This is working day!");
                break;
            case "6":
            case "0":
                System.out.println("This is weekend day!");
                break;
            default:
                System.out.println("User input is not correct: " + userInput);
        }

        myScanner.close();
    }
}
