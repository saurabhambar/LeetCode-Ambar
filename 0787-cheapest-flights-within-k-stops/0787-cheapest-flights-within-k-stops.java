class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
         Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] flight : flights) {
            adj.computeIfAbsent(flight[0], value -> new ArrayList<>()).add(new int[] {flight[1], flight[2]});
        }
        int[] shortDist = new int[n];
        Arrays.fill(shortDist, Integer.MAX_VALUE);
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {src, 0});
        int stops = 0;   
        while (stops <= k && !queue.isEmpty()) {
            int qLen = queue.size();
            while (qLen-- > 0) {
                int[] temp = queue.poll();
                int node = temp[0];
                int distance = temp[1];
                if (!adj.containsKey(node)) {
                    continue;
                }
                for (int[] e : adj.get(node)) {
                    int neighbour = e[0];
                    int cost = e[1];
                    if (cost + distance >= shortDist[neighbour]) {
                        continue;
                    }
                    shortDist[neighbour] = cost + distance;
                    queue.offer(new int[] {neighbour, shortDist[neighbour]});
                }
            }
            stops++;
        }
        return (shortDist[dst] == Integer.MAX_VALUE) ? -1 : shortDist[dst];
        
    }
}