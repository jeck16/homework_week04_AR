package homework_week04_AR;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false
 */

public class hasSharedDigit13 {

    public static int getEvenDigitSum(int number) {
        // Check if the number is negative.
        if (number < 0) {
            return -1;
        }

        // Initialize the sum of even digits.
        int sum = 0;

        // Iterate over the digits of the number.
        while (number > 0) {
            // Get the last digit of the number.
            int digit = number % 10;

            // If the digit is even, add it to the sum.
            if (digit % 2 == 0) {
                sum += digit;
            }

            // Remove the last digit from the number.
            number /= 10;
        }

        // Return the sum of even digits.
        return sum;
    }

    public static boolean isPrime(int number) {
        // Check if the number is less than 2.
        if (number < 2) {
            return false;
        }

        // Iterate over all numbers from 2 to the square root of the number.
        for (int i = 2; i <= Math.sqrt(number); i++) {

            // If the number is divisible by any number from 2 to its square root,
            // it is not a prime number.
            if (number % i == 0) {
                return false;
            }
        }

        // If the number is not divisible by any number from 2 to its square root,
        // it is a prime number.
        return true;
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        // Check if the numbers are within the range of 10-99.
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        // Convert the numbers to strings.
        String number1String = String.valueOf(number1);
        String number2String = String.valueOf(number2);

        // Check if the strings have any common characters.
        for (char c : number1String.toCharArray()) {
            if (number2String.contains(Character.toString(c))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Call the getEvenDigitSum method and print the result.
        System.out.println(getEvenDigitSum(123456789)); // 20
        System.out.println(getEvenDigitSum(252)); // 4
        System.out.println(getEvenDigitSum(-22)); // -1

        // Check if the number is prime.
        System.out.println(isPrime(10)); // false
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(12)); // false

        // Check if the numbers have any shared digits.
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        System.out.println(hasSharedDigit(15, 55)); // true
    }
}
