import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b.toLowerCase());
        }

       
        String[] words = paragraph
                .toLowerCase()
                .replaceAll("[^a-z ]", " ")
                .split("\\s+");

       
        Map<String, Integer> countMap = new HashMap<>();

        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }

        String answer = "";
        int max = 0;

        for (String key : countMap.keySet()) {
            if (countMap.get(key) > max) {
                max = countMap.get(key);
                answer = key;
            }
        }

        return answer;
    }
}
