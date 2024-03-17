class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        Set<String> trans = new HashSet<>();
        for (String word :
                words) {
            StringBuilder translate = new StringBuilder();
            for (char c :
                    word.toCharArray()) {
                translate.append(morseCode[c-'a']);
            }
            trans.add(translate.toString());
        }
        return trans.size();
    }
}
