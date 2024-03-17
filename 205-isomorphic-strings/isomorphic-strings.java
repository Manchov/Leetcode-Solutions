class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> dictionary = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char l1 = s.charAt(i);
            char l2 = t.charAt(i);
            if (dictionary.containsKey(l1))
            {
                if (dictionary.get(l1).equals(l2))
                    continue;
                else return false;
            } else if (dictionary.containsValue(l2)) {
                return false;
            } else
                dictionary.put(l1,l2);
        }
        return true;
    }
}
