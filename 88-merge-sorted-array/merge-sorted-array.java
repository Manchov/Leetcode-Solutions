class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        int nIndex = n - 1;
        int pos = m + n - 1;
        while ((mIndex >= 0) || (nIndex >= 0)) {
            if ((mIndex >= 0) & (nIndex >= 0)){
                if (nums1[mIndex]>nums2[nIndex]){
                    nums1[pos--]=nums1[mIndex--];
                }else nums1[pos--]=nums2[nIndex--];
            } else if ((mIndex>=0)&(nIndex<0)) {
                nums1[pos--]=nums1[mIndex--];
            } else nums1[pos--]=nums2[nIndex--];
        }
//        int i = 0, j = 0;
//        int length = m + n;
//        int[] nums = new int[m + n];
//        for (int k = 0; k < length; k++) {
//            if ((m != 0) & (nums1[i] <= nums2[j])) {
//                nums[k] = nums1[i];
//                i++;
//                m--;
//            } else if ((n != 0) & (nums1[i] > nums2[j])) {
//                nums[k] = nums2[j];
//                j++;
//                n--;
//            } else if (n == 0) {
//                nums[k] = nums1[i];
//                i++;
//                m--;
//            } else if (m == 0) {
//                nums[k] = nums2[j];
//                j++;
//                n--;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        nums1 = nums;
//        System.out.println(Arrays.toString(nums1));
    }
}
