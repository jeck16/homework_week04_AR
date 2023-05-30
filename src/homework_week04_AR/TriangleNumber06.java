package homework_week04_AR;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

import java.util.Scanner;

public class TriangleNumber06 {

    public static void main(String[] args) {
        // Create a new Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows from the console.
        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();

        // Print the pattern.
        printPattern(numberOfRows);
    }
    public static void printPattern(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
