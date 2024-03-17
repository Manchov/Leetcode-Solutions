class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target<nums[0])
            return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target)
                return i;
            if ((i!=0)&&(nums[i-1]<target)&&(nums[i]>target))
                return i;
        }
        return nums.length;
    }
}
