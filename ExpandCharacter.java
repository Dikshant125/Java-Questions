/***
 * Question:  Character Frequency (Number of times a character repeat) in a String.
 * Owner name: Dikshant Goswami
 *  expandCharacter() is a  method which take input like a1b2c3 and convert into abbccc.
 * Date: 3-9-2024
 */
import java.util.Scanner;

public class ExpandCharacter {


    public static boolean checkUppercaseString(String input) {
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    // expandCharacter() is a function which take string as input and expand
    // character of string followed by each char.
    public static void expandCharacter() {

        Scanner sc = new Scanner(System.in);

        int key;
        boolean continueProgram = true;
        String input;

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
                    System.out.println(Constants.ENTER_STRING);
                    input = sc.next();

                    if (checkUppercaseString(input)) {
                        System.out.println(Constants.LOWERCASE_WARNING);
                    } else {
                        int i = 0;
                        String output = "";

                        while (i < input.length()) {
                            char character = input.charAt(i);
                            i++;

                            // check if string does not contain number followed by number then it return
                            // same string.
                            if (i < input.length() && Character.isDigit(input.charAt(i))) {

                                String number = "";
                                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                                    number += input.charAt(i);
                                    i++;
                                }

                                int count = Integer.parseInt(number);

                                // For loop to expand character
                                for (int j = 0; j < count; j++) {
                                    output += character;
                                }
                            } else {
                                output += character;
                            }
                        }
                        System.out.println(output);
                        break;
                    }

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

    public static void main(String[] args) {
        expandCharacter();
}
}