package homework_week04_AR;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge02 {

    public static void main(String[] args) {
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

            scanner.close();
        }
}
