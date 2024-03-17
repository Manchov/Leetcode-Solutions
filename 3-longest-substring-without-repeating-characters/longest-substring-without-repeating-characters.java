class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder chars = new StringBuilder(s);
        StringBuilder window = new StringBuilder();
        StringBuilder longestString = new StringBuilder();
        int longest = 0;
        for (int i = 0; i < chars.length(); i++) {
            if (window.indexOf(chars.substring(i, i + 1)) == -1) {
                window.append(chars.substring(i, i + 1));
                if (longest <= window.length()) {
                    longest = window.length();
                    longestString = window;
                }
            } else {
                window = new StringBuilder(window.substring((window.lastIndexOf(chars.substring(i, i + 1))) + 1));
                window.append(chars.substring(i, i + 1));
            }
        }
        return longest;
    }

    ;
}
