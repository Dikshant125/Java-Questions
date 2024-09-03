/***
 * Question: Expand Characters in a String
 * Owner name: Dikshant Goswami
 *  stringFollowedByNumber() is a  method which take input like abbbccc and convert into ab3c3.
 * Date: 3-9-2024
 */
import java.util.Scanner;

public class CharacterFrequency {



    // stringFollowedByNumber() is a function that takes a string like abbbccc and
    // converts it to a1b3c3
    public static void stringFollowedByNumber() {
        String input;
        System.out.println(Constants.ENTER_FREQ_STRING);
        Scanner sc = new Scanner(System.in);
        input = sc.next();

        String output = "";
        int i = 0;

        // check if input contains any uppercase letters
        if (!input.equals(input.toLowerCase())) {
            System.out.println(Constants.LOWER_WARN);
        } else {

            while (i < input.length()) {
                char character = input.charAt(i);
                int count = 0;

                // count occurrences of the current character
                while (i < input.length() && input.charAt(i) == character) {
                    count++;
                    i++;
                }

                // append the character and its count to the output string
                output = output + character;
                output = output + count;
            }
            System.out.println(output);
        }
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
                    stringFollowedByNumber();
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