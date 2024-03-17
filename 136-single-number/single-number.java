class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int num :
                nums) {
            sum^=num;
        }
        return sum;
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int num:
//             nums) {
//            if (numbers.contains(num))
//                numbers.remove(numbers.indexOf(num));
//            else
//                numbers.add(num);
//        }
//        return numbers.isEmpty()?0:numbers.get(0);
    }
}
