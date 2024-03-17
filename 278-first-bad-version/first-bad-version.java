/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int winl = 1;
        int winr = n;
        int half = 1;
        while (winl <= winr) {
            half = winl + (winr - winl) / 2;
            if (isBadVersion(half) == true) {
                if (winl == winr)
                    return half;
                else winr = half - 1;
            } else
                winl = half + 1;
        }
        return isBadVersion(half) ? half : half+1;
    }

}
