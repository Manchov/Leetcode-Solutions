class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        int n = senate.length();
        for(int i = 0;i < n;i++){
            if(senate.charAt(i) == 'R') qr.add(i);
            else qd.add(i);
        }
        for(;!qr.isEmpty() && !qd.isEmpty();){
            int r_i = qr.poll();
            int d_i = qd.poll();
            if(r_i < d_i) qr.add(r_i + n);
            else qd.add(d_i + n);
        }
        return qr.size() > qd.size() ? "Radiant" : "Dire";
        // Create counters for each party
//        int r = 0, d = 0;
//        // Create a list to keep track of banned senators
//        List<Integer> banned = new ArrayList<>();
//        // Iterate over the senators
//        for (int i = 0; i < senate.length(); ++i) {
//            // If this senator is banned, skip him
//            if (banned.contains(i)) continue;
//            // If the senator is from the Radiant party, decrement the Radiant counter
//            if (senate.charAt(i) == 'R') {
//                if (d == 0) banned.add(senate.indexOf('D',i));
//                else
//                    d--;
//            }
//            // If the senator is from the Dire party, decrement the Dire counter
//            else {
//                if (r == 0) banned.add(senate.indexOf('R',i));
//                else
//                    r--;
//            }
//        }
//        // Return the winner
//        if (r==d)
//            return (senate.charAt(0)=='R') ? "Radiant" : "Dire";
//        return r > d ? "Radiant" : "Dire";
//        int R = 0;
//        int D = 0;
//        int RP = 0;
//        int DP = 0;
//        System.out.println("String : "+senate);
//        StringBuilder stringBuilder = new StringBuilder();
//        for (char ch :
//                senate.toCharArray()) {
//            if (ch == 'R')
//                if (R < 0) {
//                    R++;
//                } else {
//                    D--;
//                    R++;
//                    RP++;
//                    stringBuilder.append(ch);
//                }
//            else {
//                if (D < 0) {
//                    D++;
//                } else {
//                    R--;
//                    D++;
//                    DP++;
//                    stringBuilder.append(ch);
//                }
//            }
//        }
//        System.out.println(stringBuilder);
//        System.out.println("R : " + R + "| RP : " + RP + "| D : " + D + "| DP : " + DP);
//        if ((((R>=-1)||(D>=-1))&&((RP>0)&(DP>0))))
//            return predictPartyVictory(stringBuilder.toString());
//        if (R==D)
//            return senate.charAt(0)=='R'? "Radiant" : "Dire";
//        return R >= D ? "Radiant" : "Dire";
    }
}
