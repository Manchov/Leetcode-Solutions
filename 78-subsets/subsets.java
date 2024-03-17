class Solution {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
//        Arrays.sort(nums);
//        int[] newnums = Arrays.stream(nums).sorted();
        backtrack(new ArrayList<>(), nums, 0);
        return lists;
    }

//    private void backtrack(List<List<Integer>> lists, List<Integer> list, int[] nums, int start) {
////        lists.add(new ArrayList<>(list));
//        if (start< nums.length){
//            list.add(nums[start]);
//            backtrack(lists, list, nums, start + 1);
//            list.remove(list.size() - 1);
//            backtrack(lists,list,nums,start+1);
//            System.out.println(list);
//        }
////        for (int i = start; i < nums.length; i++) {
//        lists.add(new ArrayList<>(list));
//        return;
////        }
//    }

    private void backtrack(List<Integer> list, int[] nums, int index) {
        if (index >= nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
//        lists.add(nums[index]);
//        if (!lists.contains(new ArrayList<>(nums[index]))){
//            lists.add(new ArrayList<>(nums[index]));
//        }
//        lists.add(new ArrayList<>(list));
        backtrack(list,nums,index+1);
        list.add(nums[index]);
        backtrack(list,nums,index+1);
        list.remove(list.size()-1);

    }
}
