package Palindrome;

public class Approach_1 {
    public static void main(String[] args) {

        String forward = "A man, a plan, a canal, panama";
        checkPalindrome(forward);
    }

    public static void checkPalindrome(String forward) {

        // Remove non-alphanumeric characters and convert to lowercase
        String sanitized = forward.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the sanitized string
        StringBuilder reversed = new StringBuilder(sanitized).reverse();

        // Check if sanitized string is equal to reversed string
        boolean result = sanitized.equals(reversed.toString());

        // Print the result
        System.out.println("Is palindrome? " + result);
    }
}

// Sanitizing the input to remove non-alphanumeric characters and making it case-insensitive.
// Reversing the sanitized string and checking equality with the original sanitized string.

// Time Complexity

// Sanitizing the String:
//     replaceAll("[^a-zA-Z0-9]", "") and toLowerCase() both traverse the string once.
//     Time Complexity: O(n), where n is the length of the original string.

// Reversing the String:
//     StringBuilder.reverse() traverses the sanitized string to create its reverse.
//     Time Complexity: O(m), where m is the length of the sanitized string (≤ n).

// Comparison:
//     sanitized.equals(reversed.toString()) also takes O(m) to compare the strings.

// Overall Time Complexity: O(n + m + m) = O(n).