package Find_First_Non_Repeated_Character;

// Write a Java program to find the first non-repeated character in a given string.
// If all characters are repeated, return a special character (e.g., '-').

public class Approach_1 {
    public static void main(String[] args) {
        String input = "swiss"; // You can use Scanner for user input
        char result = findFirstNonRepeatedCharacter(input);
        System.out.println("First non-repeated character: " + result);
    }

    public static char findFirstNonRepeatedCharacter(String input) {
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < input.length(); j++) {
                if (i != j && current == input.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return current;
            }
        }

        return '-'; // If no non-repeated character is found
    }
}