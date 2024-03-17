class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isBlank())
            return true;

        int i = 0;
        int j = 0;
        int sublen = s.length();
        int suplen = t.length();
        String format = "%-40s%s%n";
        char letter = s.charAt(i);
        while (i<sublen && j<suplen){
            if (s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
//        for (int j = 0; j < t.length() && i < s.length(); j++) {
//            System.out.println("I: "+i+" "+s.charAt(i)+"\tJ: "+j +" "+t.charAt(j));
//            if (s.charAt(i)==t.charAt(j)){
//                if (i==s.length()-1)
//                    return true;
//                i++;}
//        }
//        for (char c :
//                t.toCharArray()) {
//            if (i==s.length()-1)
//                return true;
//            if (letter == c){
//                i++;
//                letter = s.charAt(i);
//            }
//        }
        if (i==sublen)
            return true;
        else return false;

    }
}
