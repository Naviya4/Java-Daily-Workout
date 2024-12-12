package Find_First_Non_Repeated_Character;

import java.util.LinkedHashMap;
import java.util.Map;

public class Approach_2 {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedCharacter(input);
        System.out.println("First non-repeated character: " + result);
    }

    public static char findFirstNonRepeatedCharacter(String str) {
        // Use LinkedHashMap to maintain the order of insertion
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Return '-' if no non-repeated character is found
        return '-';
    }
}

