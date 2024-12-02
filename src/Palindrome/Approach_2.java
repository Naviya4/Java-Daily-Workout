package Palindrome;

public class Approach_2 {
    public static void main(String[] args) {

        String input = "A man, a plan, a canal, Panama";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {

        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two pointers to check for palindrome
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }
}

// Sanitizing the input to remove non-alphanumeric characters and making it case-insensitive.
// Use two pointers, left starting at the beginning and right at the end.
// Compare the characters at these positions and move the pointers toward the center.
// If all corresponding characters match, the string is a palindrome.

// Time Complexity

// Sanitizing the String:
//     replaceAll("[^a-zA-Z0-9]", "") and toLowerCase() both traverse the string once.
//     Time Complexity: O(n), where n is the length of the original string.

// Palindrome Check:
//     The two-pointer approach iterates from both ends towards the middle.
//     In the worst case, it compares each character once.
// Time Complexity: O(m) for the palindrome check.

// Cleaning and checking both take linear time.
// Overall Time Complexity: O(n + m) = O(n).

// Even though both approach has same time complexities, approach_2 is ideal as it stops early if a mismatch is found.