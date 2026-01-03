class Solution {
    public String longestPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            String p1 = check(s, i, i);
            String p2 = check(s, i, i + 1);

            if (p1.length() > ans.length())
                ans = p1;

            if (p2.length() > ans.length())
                ans = p2;
        }

        return ans;
    }
    static String check(String s, int l, int r) {

        while (l >= 0 && r < s.length()
                && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return s.substring(l + 1, r);
    }
}
