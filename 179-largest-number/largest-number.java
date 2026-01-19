import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {

        List<String> list = new ArrayList<>();

        for (int n : nums) {
            list.add(String.valueOf(n));
        }

        Collections.sort(list, (x, y) -> (y + x).compareTo(x + y));

        if (list.get(0).equals("0")) return "0";

        String result = "";
        for (String s : list) {
            result += s;
        }

        return result;
    }
}
