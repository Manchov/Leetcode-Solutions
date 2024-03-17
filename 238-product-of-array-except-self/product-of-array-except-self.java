class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zero_pos = -1;
        int index = -1;
        for (int number :
                nums) {
            index++;
            if ((number == 0) & (zero_pos == -1)) {
                zero_pos = index;
                continue;
            } else if ((number == 0) & (zero_pos > -1)) {
                return new int[nums.length];
            }
            product *= number;
        }
//        System.out.println(product);
//        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if ((zero_pos > -1) & (i != zero_pos)) {
                nums[i] = 0;
                continue;
            } else if ((zero_pos > -1) & (i == zero_pos)) {
                nums[i] = product;
                continue;
            } else nums[i] = product / nums[i];
        }
        return nums;
    }
}
