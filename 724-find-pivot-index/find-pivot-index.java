class Solution {
    public int pivotIndex(int[] nums) {
        int suml = 0;
        int sum = 0;
        for (int num:
             nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (suml*2==sum-nums[i])
                return i;
            suml+=nums[i];

        }
        return -1;

    }
}