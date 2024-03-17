class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        LinkedList<Integer>[] linkedLists = new LinkedList[n + 1];
        int[] teams = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            linkedLists[i] = new LinkedList<>();
        }
        for (int[] set :
                dislikes) {
            int person = set[0];
            int dperson = set[1];
//            System.out.println(person);
//            System.out.println(dperson);
            linkedLists[person].add(dperson);
            linkedLists[dperson].add(person);
        }
        Arrays.fill(teams, -1);
        int numTeams = 0;
        for (int i = 1; i <= n; i++) {
            if (teams[i] == -1) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                teams[i] = 0;
                numTeams++;
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int neighbor : linkedLists[node]) {
                        if (teams[neighbor] == -1) {
                            teams[neighbor] = 1 - teams[node];
                            queue.add(neighbor);
                            numTeams++;
                        } else if (teams[neighbor] == teams[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        return numTeams==n;

    }
}
