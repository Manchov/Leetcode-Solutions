class Solution {
    public int removeElement(int[] nums, int val) {
        int p = nums.length;
        for (int i = 0; i < p; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[--p];
            }
        }
        return p;
    }
}
