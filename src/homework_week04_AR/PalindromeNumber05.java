package homework_week04_AR;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212
 */

import java.util.Scanner;

public class PalindromeNumber05 {


    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int reverse = 0;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }

        return number == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212)); //

        // Call the method with a user-input number
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("Is " + userInput + " a palindrome? " + isPalindrome(userInput));
    }
}


