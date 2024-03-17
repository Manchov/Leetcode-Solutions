class Solution {
    public int calPoints(String[] operations) {
        int index = 0;
        int record = 0;
        int list_pointer = -1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (index<operations.length) {
            switch (operations[index]) {
                case "C":
                    list.remove(list_pointer);
                    list_pointer--;
                    break;
                case "D":
                    int product = list.get(list_pointer)*2;
                    list.add(product);
                    list_pointer++;
                    break;
                case "+":
                    int sum = list.get(list_pointer)+list.get(list_pointer-1);
                    list.add(sum);
                    list_pointer++;
                    break;
                default:
                    list.add(Integer.parseInt(operations[index]));
                    list_pointer++;
                    break;
            }
            System.out.println(list);
            index++;
        }
        for (int num:
             list) {
            record+=num;
        }
        return record;
    }
}
