package homework_week04_AR;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;

public class ArmstrongNumber10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        boolean isArmstrong = isArmstrongNumber(number);

        if (isArmstrong){
            System.out.println(number + " is am Armstrong number. ");
        }else {
            System.out.println(number + " is not an Armstrong number.b");
        }
    }
    public static boolean isArmstrongNumber(int number){
        int originalNumber = number;
        int sum = 0;

        while (number > 0){
            int digit = number % 10;
            sum += digit * digit * digit ;
            number /= 10;
        }
        return sum == originalNumber;    }
}
