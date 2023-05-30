package homework_week04_AR;
/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments
 */

import java.util.Scanner;

public class DigitSumChallenge04 {
    public static void main(String[] args) {
        // Call the readNumbers() method.
        readNumbers();

        // Call the readMinMax() method.
        readMinMax();

        // Call the vowelOrConsonant() method.
        vowelOrConsonant();

        // Call the sumDigits() method.
        System.out.println("The sum of the digits in 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in 1 is " + sumDigits(1));
        System.out.println("The sum of the digits in -125 is " + sumDigits(-125));
    }

    public static void readNumbers() {
        // Create a new Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Read 10 numbers from the console entered by the user and print the sum of those numbers.
        int sum = 0;
        int count = 1;

        while (count <= 10) {
            System.out.println("Enter number #" + count + ":");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }

            count++;
        }

        System.out.println("The sum of the numbers is " + sum);
    }

    public static void readMinMax() {
        // Create a new Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
        }

        System.out.println("The minimum number is " + min);
        System.out.println("The maximum number is " + max);
    }

    public static void vowelOrConsonant() {
        // Create a new Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an alphabet:");
        String input = scanner.next();

        if (input.length() > 1) {
            System.out.println("Error: Input must be a single character.");
        } else if (!Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Input must be a letter.");
        } else {
            char ch = input.charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
    }

    public static int sumDigits(int number) {
        if (number < 10 || number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
