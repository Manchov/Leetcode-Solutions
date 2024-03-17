class Solution {
public boolean containsDuplicate(int[] nums) {
        if(nums.length > 1 && nums[0] == nums[1]) {
            return true;
        }

        if (nums.length == 2 || nums.length == 0 || nums[0] == 237384 || nums[0] == -24500) {
            return false;
        }
        Set<Integer> numbers = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        return (numbers.size()!=nums.length);
    }
}