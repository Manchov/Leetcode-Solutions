class Solution {
    public int reverse(int x) {
        int copy = x;
        long xr = 0;
        while (copy!=0){
            xr = xr*10+(copy%10);
            copy/=10;
        }
        return xr<Integer.MIN_VALUE||xr>Integer.MAX_VALUE ? 0 : (int) xr;
    }
}
