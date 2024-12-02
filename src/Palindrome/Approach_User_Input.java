package Palindrome;

import java.util.Scanner;

public class Approach_User_Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String forward = scanner.nextLine();

        checkPalindrome(forward);
    }

    public static void checkPalindrome(String forward) {

        String sanitized = forward.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(sanitized).reverse();
        boolean result = sanitized.equals(reversed.toString());

        System.out.println("Is palindrome? " + result);
    }
}