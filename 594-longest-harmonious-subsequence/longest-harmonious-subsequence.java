class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int highest = 0;
        for (int num:
             nums) {
            map.put(num, map.getOrDefault(num,0)+1);
            if (map.containsKey(num+1))
                highest = Math.max(highest,map.get(num)+map.get(num+1));
            if (map.containsKey(num-1))
                highest=Math.max(highest,map.get(num)+ map.get(num-1));
        }

        return highest;
    }
}
