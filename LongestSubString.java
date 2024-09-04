/***
 * Question: Longest Substring Without Repeating Characters.
 * Owner name: Dikshant Goswami
 *  lengthOfLongestSubstring() is a  method which take input as a string and return the max_length string.
 * Date: 3-9-2024
 */

import java.util.Scanner;

public class LongestSubString {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
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
            sc.nextLine(); // To consume the newline character

            switch (key) {
                case 1:
                    System.out.println(Constants.ENTER_STR);
                    String s = sc.nextLine();
                    int len = lengthOfLongestSubstring(s);
                    System.out.println(Constants.MAX_LENGTH_STRING+ len);
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

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0, mx = 0;
        int[] arr = new int[255];

        while (j < n) {
            int ascii = (int) s.charAt(j);
            if (arr[ascii] == 0) {
                arr[ascii]++;
                mx = max(mx, j - i + 1);
                j++;
            } else {
                while (s.charAt(i) != s.charAt(j)) {
                    arr[(int) s.charAt(i)]--;
                    i++;
                }
                i++;
                arr[ascii]--;
            }
        }
        return mx;
    }
}
