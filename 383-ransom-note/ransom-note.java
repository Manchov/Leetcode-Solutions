class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder note = new StringBuilder(ransomNote);
        StringBuilder letters = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            if (letters.indexOf(note.substring(i,i+1))!=-1){
                letters.deleteCharAt(letters.indexOf(note.substring(i,i+1)));
            } else return false;
        }
        return true;
    }
}
