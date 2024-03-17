class Solution {
    //    public boolean cantWinNim(int n) {
//        if (n<=3) return false;
//        return canWinNim(n-1)||canWinNim(n-2)||canWinNim(n-3);
//    }
//    public boolean canWinNim(int n) {
//        if (n<=3) return true;
//        return cantWinNim(n-1)||cantWinNim(n-2)||cantWinNim(n-3);
//    }
    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}
