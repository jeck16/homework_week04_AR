package homework_week04_AR;
/**
 * ead 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 */

import java.util.Scanner;

public class ReadingUserInputChallenge01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int sum = 0;
         int count = 1;

         while ( count <= 10){
             System.out.println("Enter number #" + count + ":  ");

             if (scanner.hasNext()){
                 int number = scanner.nextInt();
                 sum += number;
             }else {
                 System.out.println("Invalid Number");
             }
             count++;
         }
        System.out.println("The sum of the number is" + sum);
         scanner.close();
    }
}
