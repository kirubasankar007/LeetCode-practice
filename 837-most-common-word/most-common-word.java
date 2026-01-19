import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replace('!', ' ')
                             .replace('?', ' ')
                             .replace('\'', ' ')
                             .replace(',', ' ')
                             .replace(';', ' ')
                             .replace('.', ' ');


        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b);
        }

        String[] words = paragraph.split(" ");

        Map<String, Integer> map = new HashMap<>();

       
        for (String w : words) {
            if (w.length() > 0 && !bannedSet.contains(w)) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        String ans = "";
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }

        return ans;
    }
}
