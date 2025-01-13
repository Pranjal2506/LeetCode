class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: piles){
            pq.offer(i);
        }
        for(int i=0; i<k; i++){
            int temp = pq.poll();
            pq.add((temp+1) / 2);
        }
        int ans = 0;
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        return ans;
    }
}