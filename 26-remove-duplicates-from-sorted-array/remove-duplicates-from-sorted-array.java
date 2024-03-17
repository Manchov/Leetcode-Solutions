class Solution {
    public int removeDuplicates(int[] nums) {
        int lastIndex = 0;
        int lastNum = nums[0];
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != lastNum){
                lastIndex++;
                nums[lastIndex]=nums[i];
                lastNum=nums[i];
            }
        }
        return lastIndex+1;
    }
}
