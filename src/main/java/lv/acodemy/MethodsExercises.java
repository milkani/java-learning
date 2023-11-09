package lv.acodemy;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(Math.round(fahrenheitConverter(120)));
        System.out.println(fahrenheitConverter(120));

        System.out.println(currencyConverter("CZK", 50));
        System.out.println(currencyConverter("GBP", 120));

        System.out.println(isPalindrome("radar"));

        // CIVIC
        // c = [0]
        // i = [1]
        // v = [2]
        // i = [3]
        // c = [4]

        String word = "civic";
        System.out.println(word.charAt(4));
        System.out.println(calculator("-", 20, 10));
    }

    public static double fahrenheitConverter(double fahrenheit) {
        return (fahrenheit - 32) / 1.80000;
    }

    public static double currencyConverter(String currency, double money) {
        double convertedAmount;
        switch (currency) {
            case "PLN":
                convertedAmount = money * 4.45;
                break;
            case "CZK":
                convertedAmount = money * 24.55;
                break;
            case "GBP":
                convertedAmount = money * 0.87;
                break;
            default:
                throw new RuntimeException("Unsupported currency: " + currency);
        }
        return convertedAmount;
    }

    public static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            // word.charAt(4) = c;
            // word.charAt(3) = i;
            // word.charAt(2) = v;
            reversed = reversed + word.charAt(i);
        } //
        return reversed.equals(word);
    }

    public static double calculator(String operation, double firstNumber, double secondNumber) {
        double result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            default:
                throw new RuntimeException("Invalid operation: " + operation);
        }
        return result;
    }
}

    /*
    1. Create currency converter from X currency to EUR (https://www.bank.lv/statistika/dati-statistika/valutu-kursi/aktualie)
    2. Create Fahrenheit to Celsius formula (F - 32 / 1.80000)
    3. Create simple calculator method
    4. Check if word is Palindrome
     */






