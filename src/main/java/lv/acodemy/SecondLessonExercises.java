package lv.acodemy;

public class SecondLessonExercises {
    public static void main(String[] args) {

//        Even or Odd Number Checker:
//        Write a program that takes an integer input
//        from the user and checks if it's even or odd using an if statement.

        int number = 11;
        if (number % 2 == 0) {
            System.out.println("This is even number!");
        } else {
            System.out.println("This is odd number!");
        }

//        Largest of Three Numbers:
//        Create a program that takes three numbers as input
//        and determines which one is the largest using if-else-if statements.

        int x = 10;
        int y = 12;
        int z = 14;

        if (x > y && x > z) {
            System.out.println("Largest number is: " + x);
        } else if (y > x && y > z) {
            System.out.println("Largest number is: " + y);
        } else if (z > x && z > y) {
            System.out.println("Largest number is: " + z);
        } else {
            System.out.println("They all are equals or 0");
        }

        // Tricky stuff
        System.out.println(Math.max(10, Math.max(5, 14)));

        //Positive, Negative, or Zero Checker:
        // Create a program that reads a number from the user and determines
        // if it's positive, negative, or zero using an if statement.

        int num = 10;
        if (num == 0) {
            System.out.println("Number is Zero!");
        } else if (num < 0) {
            System.out.println("This number is negative!");
        } else {
            System.out.println("Positive number");
        }

//        BMI (Body Mass Index) Calculator: Take a person's weight and height as input and use an if statement to calculate and display their BMI category
//        (e.g., underweight, normal weight, overweight, or obese).
//        (BMI = weight (kg) / (height (m) * height (m)))

        double weight = 65.0;
        double height = 1.74;

        double bmi = weight / (height * height);
        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
            System.out.println("Minimal health risk");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
            System.out.println("Minimal health risk");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
            System.out.println("Increased health risk");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obese");
            System.out.println("High health risk");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Severely Obese");
            System.out.println("Very high health risk");
        } else {
            System.out.println("Morbidly Obese");
            System.out.println("Extremely high health risk");
        }

//        Password Strength Checker: Ask the user to enter a password and then use if statements to determine its strength
//        (e.g., weak, medium, strong) based on criteria such as length, special characters, and uppercase letters.
//        If the password is less than 8 characters, lacks special characters, or lacks uppercase letters,
//        it's considered "weak."
//        If the password is between 8 and 11 characters, it's considered "of medium strength."
//        If the password is 12 or more characters, it's considered "strong."

        int passwordCharacterCount = 12;
        if (passwordCharacterCount < 8) {
            System.out.println("Weak password!");
        } else if (passwordCharacterCount >= 8 && passwordCharacterCount <= 11) {
            System.out.println("Medium strength password!");
        } else {
            System.out.println("Your password is strong enough!");
        }
    }
}