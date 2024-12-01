package Reverse_String;

public class Approach_1 {
    public static void main(String[] args) {
        String st = "Hello";
        String rv = "";

        for (int i = 0; i < st.length(); i++) {
            rv = st.charAt(i) + rv;
        }

        System.out.println(rv);
    }
}

// You loop through each character of the string and add it to the beginning of the rv string.
// This approach works but is less efficient due to the string concatenation inside the loop.
// Each time you concatenate a string in Java, a new string object is created because strings are immutable.

// Your solution uses string concatenation, which has an O(n^2) time complexity because of the way strings are
// handled in Java (new objects are created every time you concatenate).