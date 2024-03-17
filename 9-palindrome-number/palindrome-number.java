class Solution {
//    boolean checkZero(int newx, int x) {
//        int xlength = (int) (Math.log10(x) + 1);
//        int newxlength = (int) (Math.log10(x) + 1);
//        int diff = (xlength - newxlength) - 2;
//        if (diff == 0)
//            return true;
//        while (diff != 0) {
//            if (newx % 10 == 0)
//                diff--
//        }
//    }

    public boolean isPalindrome(int x) {
        System.out.println("number : " + x);
        if (x < 0)
            return false;
        else if (x < 10) {
            return true;
        }
        int length = (int) (Math.log10(x) + 1);
        int firstdigit = x / (int) Math.pow(10, length - 1);
        int lastdigit = x % 10;
        System.out.println("first dig: " + firstdigit + " last dig: " + lastdigit);
        if (firstdigit == lastdigit) {
            int newx = x % (int) Math.pow(10, length - 1);
            System.out.println(newx);
            newx /= 10;
            System.out.println(newx);
            if (newx==0)
                return true;
//            if (newx<10)
//                return true;

            int xlength = (int) (Math.log10(x) + 1);
            int newxlength = (int) (Math.log10(newx) + 1);
            int diff = (xlength - newxlength) - 2;
            System.out.println(diff + "\n");
            if (diff != 0) {
                System.out.println("the nums:"+(newx % Math.pow(10, diff)) + " -newx:"+ newx +"\n");
                if ((int)(newx % Math.pow(10, diff)) == 0)
                    return isPalindrome(newx/(int)Math.pow(10, diff));
                else
                    return false;
            } else
                return isPalindrome(newx);

//            if (!checkZero(newx, x))
//                return false
//            isPalindrome(newx);
//            return true;
        } else
            return false;
        //return true;
    }
}
