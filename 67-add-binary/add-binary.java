class Solution {
    public String addBinary(String a, String b) {
        // Create a variable to store the sum of a and b as a binary string
        String result = "";

        // Starting from the rightmost (least significant) digit, add the corresponding digits
        // of a and b and store the result in result
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }

            // Append the last digit of the sum to result
            result = (sum % 2) + result;

            // Carry over the extra digit, if any, to the next iteration
            carry = sum / 2;
            i--;
            j--;
        }

        // If there is an extra digit, append it to result
        if (carry > 0) {
            result = carry + result;
        }

        return result;
    }
}
