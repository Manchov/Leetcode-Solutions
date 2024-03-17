class Solution {
    public int climbStairs(int n) {
        int before = 0, next = 1, fib = 0;
        for (int i = 0; i < n; i++) {
            fib = before + next;
            before = next;
            next = fib;
        }
        return fib;
//        if (n==1)
//            return 1;
//        else if (n==2)
//            return 2;
//        return (climbStairs(n-1)+climbStairs(n-2));
//        times out
    }
}
