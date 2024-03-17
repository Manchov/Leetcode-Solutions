class Solution {
    public int findPeakElement(int[] nums) {
        return findPeak(nums, 0, nums.length - 1);
    }

    private int findPeak(int[] nums, int left, int right) {
        if (left == right) {
            return left;
        }

        int middle = left + (right - left) / 2;

        if (nums[middle] > nums[middle + 1]) {
            return findPeak(nums, left, middle);
        } else {
            return findPeak(nums, middle + 1, right);
        }
    }
}