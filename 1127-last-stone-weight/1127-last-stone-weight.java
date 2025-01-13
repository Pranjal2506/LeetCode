class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones){
            maxHeap.add(i);
        }
        while(maxHeap.size() > 1){
            int one = maxHeap.poll();
            int two = maxHeap.poll();
            if(one != two){
                maxHeap.add(Math.abs(one - two));
            }
        }
        if(!maxHeap.isEmpty() && maxHeap.size() < 2){
            return maxHeap.poll();
        }else{
            return 0;
        }
    }
}