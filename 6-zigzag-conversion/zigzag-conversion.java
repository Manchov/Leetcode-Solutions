class Solution {
    public String convert(String s, int numRows) {
        StringBuilder words = new StringBuilder(s);
        StringBuilder coded = new StringBuilder(s.length());
        if (numRows == 1)
            return words.toString();
        int sec = 2*numRows-2;
        for (int i = 0; i < numRows; i++) {
            int jump = (i+1)==numRows ? sec:2*numRows-2*(i+1);
            int index = i;
            while (index<words.length()){
                coded.append(words.charAt(index));
                index+=jump;
                jump = sec - jump;
                if (jump==0){
                    jump = sec;
                }
            }
        }
        return coded.toString();
    }
}
