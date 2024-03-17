class Solution {
    public List<String> fizzBuzz(int n) {
        String placer = "";
        List<String> list = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            placer = "";
            if (i%3 == 0)
                placer += "Fizz";
            if (i%5==0)
                placer +="Buzz";
            if (placer=="")
                placer = Integer.toString(i);
            list.add(placer);
        }
        return list;
    }
}
