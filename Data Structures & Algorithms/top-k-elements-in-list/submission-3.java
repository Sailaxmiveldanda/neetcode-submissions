class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()){
            queue.offer(key);
            if(queue.size() > k){
                queue.poll();
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k ; i++){
            result[i] = queue.poll();
        }
        return result;
    }
}
