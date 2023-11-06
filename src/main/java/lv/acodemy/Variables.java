package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");

        // int (number)
        int myCurrentAge = 29;
        System.out.println(myCurrentAge);

        /*
        This is
        multi line
        comment approach
        TODO: Delete it later
         */

        byte myWeight = 70; // byte data type
        short salary = 2000; // short data type
        char myFirstLetterOfName = 'N'; // character data type
        long populationOfLatvia = 1900000; // long data type

        double numberPi = Math.PI; //PI number
        float randomNumber = 313813.1313f; //float number
        double classicFloatingNumber = 231937183.31371837131; // double number

        // Boolean true/false is, has
        // Example: isSummer, isAdult, hasEnoughAge, hasProperValue;
        boolean isSummer = false;
        boolean isAutumn = true;

        // Exercise 1.
        // Create 2 variables for each data type
        // Variable should be meaningful as it possible
        // Variable name should contain at least 2 words
        // Print all the variable values
        // lower camel case


        // kebab case: my-current-age
        // snake case: my_snake_case
        // lower camel case: loweCamelCase
        // constants: int MY_AGE = 10;

        int x, y, z;
        x = 10;
        y = 4;
        z = 8;

        int summa = x + y + z;
        System.out.println(summa);

        int summaExample = (10 + 5) + ((2 - y) * 4) + z;
        System.out.println(summaExample);

        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        System.out.println(result);

        int remainder = 10 % 3;
        System.out.println(remainder);

        // String (non-primitive)

        String firstName = "Nikita";
        String lastName = "Milka";

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName + " " + lastName);

        System.out.println("My full name is: " + firstName + " " + lastName);
        System.out.printf("My full name is: %s %s\n", firstName, lastName);
        System.out.println("Hello World");

        String mySchool = "RPV";
        System.out.println("Now I am currently studying in: " + mySchool + ".");
        System.out.printf("Now I am currently studying in: %s.\n", mySchool);

        String fullSentence = firstName + " " + lastName + "." + " I am " + myCurrentAge + " years old";
        System.out.println(fullSentence);

        // Exercise 2
        // Create two-three String variables
        // Combine (concatenate)
        // Print result out
        // Example: Today is Monday. Soon I will go home;
    }
}