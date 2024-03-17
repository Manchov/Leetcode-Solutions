class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] openedRooms = new boolean[rooms.size()];
        int openedRoomsNum = 0;
        Queue<Integer> roomQueue = new LinkedList<>();
        roomQueue.addAll(rooms.get(0));
//        roomQueue.offer(rooms.get(0).stream().toArray(Integer[]::new));
//        Queue<Integer> roomQueue = rooms.get(0).stream().collect(Collectors.toCollection(LinkedList::new));
        openedRooms[0] = true;
        openedRoomsNum = 1;
//        System.out.println(roomQueue.poll().toString());
//        System.out.println(roomQueue.poll().toString());
        while (!roomQueue.isEmpty()) {
            int roomKey = roomQueue.poll();
            if (openedRooms[roomKey] == false) {
//                roomQueue.addAll(Arrays.asList(rooms.get(roomKey)));
                roomQueue.addAll(rooms.get(roomKey));
//                roomQueue.addAll(rooms.get(roomKey).stream().map(o->(Integer)o).collect(Collectors.toCollection(LinkedList::new)));
                openedRooms[roomKey] = true;
                openedRoomsNum++;
            }
        }
//        for (int i = 0; i < rooms.size(); i++){
//            if (openedRooms[i]==false)
//                return false;
//            for (Integer key:
//                 rooms.get(i)) {
//                    openedRooms[(int)key]=true;
//            }
//        }
        System.out.println(openedRoomsNum);
        System.out.println(rooms.size());
        return openedRoomsNum == rooms.size() ? true : false;
    }
}
