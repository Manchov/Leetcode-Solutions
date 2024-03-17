class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        if (l == 0) return digits;
        int lb = l - 1;
        if (digits[lb] < 9) {
            digits[lb] += 1;
            return digits;
        } else if (digits[lb] == 9) {
            int carry = 1;
            List<Integer> array = new ArrayList<>();
            for (int i = lb; i >= 0; i--) {
                if ((carry == 1) & (digits[i] == 9)) {
                    digits[i] = 0;
                    carry = 1;
                    array.add(digits[i]);
                } else if ((carry == 1)) {
                    digits[i] += 1;
                    array.add(digits[i]);
                    carry = 0;
                } else array.add(digits[i]);
            }
            if (carry == 1)
                array.add(1);
//            int[] digs = Arrays.stream(array).mapToInt(i->i).toArray();
            int[] out = new int[array.size()];
            int size = (array.size() - 1);
            Arrays.setAll(out, i -> array.get(size - i));
            return out;
//            return array.toArray(new int[array.size()]);
        }
        return digits;
    }
}
