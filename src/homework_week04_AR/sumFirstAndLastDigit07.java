package homework_week04_AR;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class sumFirstAndLastDigit07 {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int firstDigit = number % 10;
        int lastDigit = number;
        while (lastDigit >= 10){
            lastDigit /= 10;
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println("The sum of the first and last digit of 252 is "+ sumFirstAndLastDigit(252));
        System.out.println("The sum of the first and last digit of 257 is "+ sumFirstAndLastDigit(257));
        System.out.println("The sum of the first and last digit of 0 is "+ sumFirstAndLastDigit(0));
        System.out.println("The sum of the first and last digit of 5 is "+ sumFirstAndLastDigit(5));
        System.out.println("The sum of the first and last digit of -10 is "+ sumFirstAndLastDigit(-10));
    }
}
