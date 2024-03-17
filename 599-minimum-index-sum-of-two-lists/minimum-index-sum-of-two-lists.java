class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> output = new ArrayList<>();
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            if (!map.containsKey(list1[i])){
                map.putIfAbsent(list1[i],i);
            }
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])){
                if (map.get(list2[i])+i<shortest){
                    shortest = map.get(list2[i])+i;
                    output.clear();
                    output.add(list2[i]);
                }else if (map.get(list2[i])+i==shortest)
                    output.add(list2[i]);
            }
        }
        return  output.toArray(String[]::new);

    }
}
