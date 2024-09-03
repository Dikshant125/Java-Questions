/***
 * Question:  To check a number is prime or not
 * Owner name: Dikshant Goswami
 *  isPrime() is a  method which take number and return if it is prime or not.
 * Date: 3-9-2024
 */
import java.util.Scanner;

public class PrimeNumber {



    public static boolean isPrime(int num) {
        // Check if the number is less than or equal to 1; if yes, it's not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // If the number is divisible by any number other than 1 and itself, it's not prime
            if (num % i == 0) {
                return false;
            }
        }
        // If no divisors are found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println(Constants.OPTION_ONE);
            System.out.println(Constants.OPTION_TWO);
            System.out.println(Constants.ENTER_HERE);
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next();
                continue;
                                  }
            key = sc.nextInt();

            switch (key) {
                case 1:
                    System.out.println(Constants.ENTER_NUMBER);
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        sc.next();
                        continue;
                    }
                    int num = sc.nextInt();

                    if (num <= 1) {
                        System.out.println(Constants.NEGATIVE_NUMBER_WARN);
                    } else {
                        if (isPrime(num)) {
                            System.out.println("The number " + num + " is prime.");
                        } else {
                            System.out.println("The number " + num + " is not a prime number.");
                        }
                    }
                    break;

                case 2:
                    continueProgram = false;
                    break;

                default:
                    System.out.println(Constants.DEFAULT);
                    break;
            }
        }
        sc.close();

    }
}