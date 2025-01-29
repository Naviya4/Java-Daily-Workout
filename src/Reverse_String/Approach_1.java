package Reverse_String;

public class Approach_1 {
    public static void main(String[] args) {

        String initial = "Hello";
        String reverse = "";

        for (int i = 0; i < initial.length(); i++) {
            reverse = initial.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }
}

// You loop through each character of the string and add it to the beginning of the reverse string.
// This approach works But it's less efficient due to the string concatenation inside the loop.
// Each time you concatenate a string in Java, a new string object is created because strings are immutable.

// Time Complexity

// Your solution uses string concatenation, which has an O(n^2) time complexity because of the way strings are
// handled in Java (new objects are created every time you concatenate).