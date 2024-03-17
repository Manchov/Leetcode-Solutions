class Solution {
    public int jump(int[] nums) {
        int length = nums.length - 1;
        int index = 0;
        int hops = 0;
        while (index < length) {
            int max_reach = 0;
            int next_index = 0;
//            System.out.println("I can go on for:"+nums[index]);
//            max_reach = nums[index];
            if (length<=index+nums[index]){
                hops++;
                break;
            }
            for (int i = nums[index]; i > 0; i--) {
                int reach = nums[index+i] + i;
//                System.out.println("The max_reach is:"+max_reach+" and the reach is"+reach);
                if (max_reach < reach) {
                    max_reach = reach;
                    next_index = index + i;
                }
            }
            hops++;
//            System.out.println("from "+index);
            index = next_index;
//            System.out.println(" to "+index);
        }
        return hops;

    }
}
