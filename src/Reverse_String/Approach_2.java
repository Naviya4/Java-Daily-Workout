package Reverse_String;

public class Approach_2 {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

// StringBuilder: We use StringBuilder because it is mutable, unlike String, which is immutable. This makes reversing the string more efficient.
// reverse(): This method of StringBuilder directly reverses the string.
// toString(): Converts the StringBuilder back into a String.

// The StringBuilder solution has O(n) time complexity, as it modifies the string in-place without
// creating new objects repeatedly.
