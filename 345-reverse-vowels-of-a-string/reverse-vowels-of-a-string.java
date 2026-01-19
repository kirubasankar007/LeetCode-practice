import java.util.*;

class Solution {
    public String reverseVowels(String s) {

        List<Character> vowels = new ArrayList<>();

        // Step 1: collect vowels
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels.add(c);
            }
        }

        // Step 2: build result string
        StringBuilder result = new StringBuilder();
        int index = vowels.size() - 1;

        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                result.append(vowels.get(index--));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
