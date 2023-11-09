package lv.acodemy;

public class Methods {
    public static void main(String[] args) {

        String acodemy = "Acodemy";
        printSomeText(10, acodemy);
        printSomeText(5, "IT courses!");

        System.out.println(calculateSumOfTwoNumbers(20, 40));

        int sumOfTwoNumbers = calculateSumOfTwoNumbers(10, 20);
        System.out.println(sumOfTwoNumbers);

        printInfo("Nikita", "Milka", 29);
        printInfo("John", "Doe", 99);

    }

    public static void printSomeText(int loopCount, String text) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }
    }

    public static int calculateSumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // Create method that accepts (String name, String lastName, int age)
    // Method should print out text:
    // My name is name. My surname is lastName. I am age years old.
    // If your name equals = John => you are fool!

    public static void printInfo(String name, String lastName, int age) {
        if (name.equals("John")) {
            System.out.println("You are fool!");
        } else {
            System.out.printf("My name is %s. My surname is %s. I am %d years old.\n",
                    name, lastName, age);
        }
    }


}
