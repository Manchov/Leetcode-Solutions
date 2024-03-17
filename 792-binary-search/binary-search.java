class Solution {
//    public int search(int[] nums, int target) {
//        int pointer = (int)Math.ceil(nums.length/2);
//        System.out.println(pointer+" "+nums.length);
//        if ((nums.length == 1) && (nums[0] == target))
//                return 0;
//        while (pointer>1){
//            System.out.println(pointer);
//            if (nums[pointer]==target)
//                return pointer;
//            System.out.println(nums[pointer]<target);
//            System.out.println(nums[pointer]);
//            if (nums[pointer]>target)
//                pointer/=2;
//            else pointer=pointer + pointer/2;
//            System.out.println(pointer);
//        }
//        return -1;
//    }
    public int search(int[] nums, int target) {
        int winl = 0;
        int winr = nums.length-1;
        int half = 0;
        while (winl<=winr){
            half = winl+(winr-winl)/2;
            if (nums[half]==target)
                return half;
            else if (nums[half]<target) {
                winl=half+1;
            }
            else winr=half-1;
        }
        return -1;
    }
}
