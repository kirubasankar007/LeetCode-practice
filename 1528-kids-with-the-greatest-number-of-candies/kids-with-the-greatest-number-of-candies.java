import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }

        
        for (int c : candies) {
            if (c + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
