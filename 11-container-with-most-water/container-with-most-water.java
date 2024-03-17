class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;
        while (left<right){
            max = Math.max(max,(right-left)*Math.min(height[left],height[right]));
            if (height[left]<height[right])
                left++;
            else right--;
        }
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i; j < height.length; j++) {
//                max = Math.max(max,(j-i)*Math.min(height[i],height[j]));
//            }
//        }
        return max;
    }
}
