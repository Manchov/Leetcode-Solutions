class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> array = new ArrayList<>();
        for (int[] cell :
                intervals) {
            if (cell[1] < newInterval[0]) {
                array.add(cell);
            } else if (cell[0] > newInterval[1]) {
                array.add(newInterval);
                newInterval = cell;
            } else {
                newInterval[0] = Math.min(newInterval[0], cell[0]);
                newInterval[1] = Math.max(newInterval[1], cell[1]);
            }
        }
        array.add(newInterval);
        return array.toArray(new int[array.size()][]);
    }
}
