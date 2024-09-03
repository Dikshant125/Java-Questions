/***
 * Question:  Number to Words Converter.
 * Owner name: Dikshant Goswami
 *  num_to_word() is a  method which take number between 1 and 1000 and return into its written English form.
 * Date: 3-9-2024
 */


import java.util.Scanner;

public class NumberToWord{


    public static void num_to_word() {
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
                    System.out.println(Constants.NUMBER_BETWEEN_ONE_TO_THOUSANDS);
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        sc.next();
                        continue;
                                          }
                    int num = sc.nextInt();
                    String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                            "Eighteen", "Nineteen" };
                    String[] teens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
                            "Ninety" };

                    if (num < 1 || num >= 1000) {
                        System.out.println(Constants.OUT_OF_RANGE_WARN);
                    } else {

                        int a = num % 10;
                        int b = (num / 10) % 10;
                        int d = num / 100;

                        if (num < 19) {
                            System.out.println(" " + ones[num]);
                        } else if (num >= 20 && num <= 99) {
                            System.out.println(teens[b] + " " + ones[a]);
                        } else {
                            System.out.println(ones[d] + " hundred" + (b != 0 || a != 0 ? " and " : "")
                                    + teens[b] + " " + ones[a]);
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

    public static void main(String[] args) {
        num_to_word();
    }
}