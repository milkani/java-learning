package lv.acodemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLesson {
    public static void main(String[] args) {

        // Loop!?

        // for loop
        /*
        for(counter; condition; counter change) {

        }
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        // Print numbers from 1 till 5

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Print numbers from 10 to 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        String[] arrayOfNames = {"Nikita", "John", "Mike", "Anthony", "Mary", "Ann"};

        // arrayOfNames[0] -> System.out.println();
        // arrayOfNames[1]

        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
            // arrayOfNames[0]
            // arrayOfNames[1]
            // arrayOfNames[2]
            // arrayOfNames[3]
            // arrayOfNames[4]
            // arrayOfNames[5]
        }

        // for each (will print all elements)
        for (String name : arrayOfNames) {
            System.out.println(name);
        }

        String[] countries = {
                "United States",
                "Canada",
                "United Kingdom",
                "Germany",
                "France",
                "Australia",
                "Japan",
                "India",
                "China",
                "Brazil"
        };

        // Goal: Find Japan in our array!

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("JAMETE KUDASAI!");
                break;
            }
            System.out.println(countries[i]);
        }

        int[] firstArray = {1, 2, 3, 4, 5, 7, 4};
        int[] secondArray = {3, 4, 5, 6, 7, 10, 20};
        int[] thirdArray = {5, 6, 7, 8, 9, 1, 2};

        for (int numberOfFirstArray : firstArray) {
            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : thirdArray) {
                    if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                        System.out.println(numberOfThirdArray);
                    }
                }
            }
        }

        List<Integer> commonNumbers = Arrays.stream(firstArray)
                .filter(num -> Arrays.stream(secondArray).anyMatch(x -> x == num))
                .filter(num -> Arrays.stream(thirdArray).anyMatch(x -> x == num))
                .distinct()
                .boxed()
                .collect(Collectors.toList());

        commonNumbers.forEach(System.out::println);

//         from 0 to 100
//         print even numbers
//
//         for -> iterate from 0 to 100
//         if -> if this is even number, we print it!

        int number = 51;
        boolean isEven = number % 2 == 0;
        System.out.println(isEven);

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

//        int number = 51;
//        boolean isEven = 50 % 2 == 0;
//        System.out.println(isEven);

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // while! -> do while!

        /*
        while(condition) {
        // execute code block;
        }
         */

        int i = 5;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Calculate the sum of numbers from 1 to 5 using while loop

        int x = 1;
        int summa = 0;
        while (x <= 5) {
            summa = summa + x;
            x++;
        }
        System.out.println("Summa:" + summa);
        // 1 + 2 + 3 + 4 + 5 = 15;


        // Print even numbers from 0 to 20
        int y = 0;
        while (y <= 20) {
            System.out.print(y + " ");
            y = y + 2;
        }

        /*
        do {
        // execute code block
        } while(condition);
         */

        int z = 1;
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);
    }
}