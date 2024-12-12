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

// LinkedHashMap:
// Keeps track of characters and their counts.
// Preserves the order of insertion, which is crucial for finding the first non-repeated character.

// Count Characters:
// Traverse the string once and update the count of each character in the charCountMap.

// Find Non-Repeated Character:
// Traverse the map to find the first character with a count of 1.

// Edge Case:
// If all characters are repeated, return '-'.

// Time Complexity:
// O(n): The string is traversed twice—once for counting and once for checking the map.

// This approach is more efficient for larger strings with a complexity of O(n) than the earlier approach.