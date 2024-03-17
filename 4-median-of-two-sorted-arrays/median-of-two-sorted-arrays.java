class Solution {

    int[] addArrays(int[] nums1, int[] nums2) {
        int limit = nums1.length + nums2.length;
        int[] num = new int[limit];
        int i = 0;
        int j = 0;
        int k = 0;
//        System.out.println(Arrays.toString(nums1));
//        System.out.println(Arrays.toString(nums2));
//        System.out.println(limit+" "+num.length);
        for (i = 0; i < limit; i++) {
//            System.out.println("i = "+i);
//            System.out.println("if (j < nums1.length || k < nums2.length)"+ (j < nums1.length || k < nums2.length));
            if (j < nums1.length && k < nums2.length) {
                if (nums1[j] <= nums2[k]) {
                    num[i] = nums1[j];
                    j++;
                } else {
                    num[i] = nums2[k];
                    k++;
                }
                ;
            } else if (j < nums1.length && k >= nums2.length) {
                num[i] = nums1[j];
                j++;
            } else if (k < nums2.length && j >= nums1.length) {
                num[i] = nums2[k];
                k++;
            }
            ;
//            System.out.println("iend = "+i);
        }
        return num;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //double[] nums = ArrayUtils.addAll(nums1,nums2);
//        double[] nums = nums1+nums2;
//        int[] nums = IntStream.of(nums1).toArray();
        int[] nums = addArrays(nums1, nums2);
//        System.out.println(Arrays.toString(nums));
//        System.out.println((nums[(int) ((nums.length / 2)-1)]+nums[(int) ((nums.length / 2))])/2.0);
        if (nums.length % 2 == 1)
            return (double) nums[(int) Math.ceil(nums.length / 2)];
        else
            return (double) ((nums[(int) ((nums.length / 2)-1)]+nums[(int) ((nums.length / 2))])/2.0);

    }
}
