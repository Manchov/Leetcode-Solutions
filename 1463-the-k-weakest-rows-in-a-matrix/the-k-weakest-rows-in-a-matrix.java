
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.IntStream;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
        int[] army = new int[mat.length];
        Integer[] sortedarmy = new Integer[mat.length];
        int[] finalArmy = new int[k];
//        System.out.println(mat.length);
//        System.out.println(mat[1].length);
        for (int i = 0; i < mat.length; i++) {
            army[i] = IntStream.of(mat[i]).sum();
//            for (int j = 0; j < mat[i].length; j++) {
//                if (mat[i][j] == 1) {
//                    army[i]+=1;
//                };
//            };
//            map.put(i,army[i]);
        };

//        System.out.println(Arrays.toString(army));
        for (int i = 0; i < army.length; i++) {
            int smallest = 101;
            int smallestIndex = 0;
            for (int j = 0; j < army.length; j++) {
//                System.out.println(i + " Army " + j +" : "+army[j]+ " and smallest is: "+smallest);
//                System.out.println(Arrays.toString(sortedarmy));
//                System.out.println(Arrays.asList(sortedarmy).contains(j));
//                System.out.println("gonna pass:"+((smallest>army[j])&&!(Arrays.asList(sortedarmy).contains(j))));
                if ((smallest>army[j])&&!(Arrays.asList(sortedarmy).contains(j))){
                    smallest = army[j];
//                    System.out.println(army[j]);
//                    System.out.println("smallest index:"+j);
                    smallestIndex = j;
                }
            }
            sortedarmy[i]=smallestIndex;
//            System.out.println("******************");
        }

//        System.out.println(Arrays.toString(sortedarmy));
        for(int ctr = 0; ctr < finalArmy.length; ctr++) {
            finalArmy[ctr] = sortedarmy[ctr].intValue();
        }
//        for (int i = 0; i < army.length; i++) {
//            if (army[i]>army[i+1])
//        }
//        HashMap<Integer, String> sortedMap =
//                map.entrySet().stream()
//                        .sorted(Entry.comparingByValue())
//                        .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
//                                (e1, e2) -> e1, LinkedHashMap::new));
//        //map.values().stream().sorted();
//        System.out.println(Arrays.stream(army));
//        System.out.println(sortedMap);
        return finalArmy;
    };
}
