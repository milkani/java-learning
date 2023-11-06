package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 8, 10, 11};
        // first number = 2 - > [0] index
        // second number = 3 - > [1] index
        // third number = 5 -> [2] index

        int myNumber = numbers[4];
        System.out.println(myNumber);

        // determine size of array
        System.out.println(numbers.length);

        // change number in array
        numbers[5] = 1337;
        System.out.println(Arrays.toString(numbers));

        // create empty array for 12 numbers
        int[] emptyArray = new int[12];
        System.out.println(Arrays.toString(emptyArray));

        // update empty array with numbers
        emptyArray[0] = 10;
        emptyArray[3] = 7;
        emptyArray[8] = 9;
        emptyArray[9] = 12;

        System.out.println(Arrays.toString(emptyArray));

        // String [] array
        String[] fruitBasket = {"apples", "banana", "kiwi", "pear", "pineapple"};
        // first fruit = apples -> [0] index
        // second fruit = banana -> [1] index

        String fruit = fruitBasket[3];
        System.out.println(fruit);
        System.out.println(fruitBasket[3]);

        // Logic in Java

        /*
        condition = true/false
        5 > 2 = true

        if(condition) {
       // execute this code block;
        }

        if(5 < 2) {
        // this code block will be executed in case if condition == true
        }
         */

        if (10 > 5) {
            System.out.println("This statement is true!");
        }

        if (10 < 9) {
            System.out.println("This statement is also true!");
        }

        if (fruitBasket[0].equals("apples")) {
            System.out.println("Yes, you find apples");
        }

        // if-else (is, has)
        boolean isSummer = true;

        if (isSummer) {
            System.out.println("We will lay on a beach!");
        } else {
            System.out.println("We will watch Netflix series!");
        }

        // if-else-if-else

        /*
        if(condition) {
        if condition true - execute
        } else if(condition) {
        if condition true - execute
        } else if(condition) {
        if condition true - execute
        } else {
        if no match - execute
        }
         */

//        String light = "ORANGE"; // contains color of traffic light

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color: ");
        String light = myScanner.next();

        if (light.equals("GREEEN")) {
            System.out.println("You can go!");
        } else if (light.equals("YELLOW")) {
            System.out.println("Don't go, please wait for Green light!");
        } else if (light.equals("RED")) {
            System.out.println("Don't go!");
        } else {
            System.out.println("Traffic light is not working!");
        }
    }
}
