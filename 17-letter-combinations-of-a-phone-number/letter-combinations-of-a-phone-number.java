class Solution {
    public List<String> letterCombinations(String digits) {
        String[] keypad = new String[]{"","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> combs = new ArrayList<>();
        if (digits.isEmpty())
            return combs;
        combs.add("");
        for (char i:digits.toCharArray()){
            String keypress = new String(keypad[i-'1']);
            List<String> newcombs = new ArrayList<>();
            for (char j:keypress.toCharArray()){
                for (int k = 0; k < combs.size(); k++) {
                    newcombs.add(combs.get(k)+j);
                }
            }
            combs=newcombs;
        }
        return combs;
    }
}
