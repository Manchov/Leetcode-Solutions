class Solution {
public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();
                int repetitions = n / i;
                
                for (int j = 0; j < repetitions; j++) {
                    repeated.append(substring);
                }
                
                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }
        
        return false;
    }

}