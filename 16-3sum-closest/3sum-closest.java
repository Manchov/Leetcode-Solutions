class Solution {
    public int threeSumClosest(int[] nums, int target) {
//        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int cldif = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum==target)
                    return sum;
                int dif = Math.abs(target - sum);
//                System.out.println("sum: "+sum+" dif: "+dif+" closest: "+closest);
                if (dif < cldif) {
                    closest = sum;
                    cldif = dif;
                }
//                if (dif==target){
//                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                while (j < k && nums[j] == nums[j + 1])
//                    j++;
//                while (j < k && nums[k] == nums[k - 1])
//                    k--;
//                j++;
//                k--;

                if (sum<target) {
                    j++;
                } else k--;
            }
        }
        return closest;
    }
}
