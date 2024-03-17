class Solution {
    public int longestPalindrome(String s) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (characterSet.contains(s.charAt(i)))
                characterSet.remove(s.charAt(i));
            else characterSet.add(s.charAt(i));
        }
        int charsize = characterSet.size();
        return s.length() - (charsize == 0 ? 0 : charsize -1);
        
    }
}
