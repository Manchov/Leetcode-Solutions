class Solution {
    public int mySqrt(int x) {
//        int times = 0;
        int oddNum = 1;
        while (x>=oddNum){
            x-=oddNum;
//            times++;
            oddNum+=2;
        }
//        System.out.println(times);
//        System.out.println(oddNum/2);
        return oddNum/2;
    }
}
