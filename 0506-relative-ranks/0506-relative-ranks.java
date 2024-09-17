class Solution {
    public class info implements Comparable<info>{
            int rank;
            int idx;
            public info(int rank, int idx){
                this.rank = rank;
                this.idx = idx;
            }
            public int compareTo(info b){
                return b.rank - this.rank;
            }
        }
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<info> pq = new PriorityQueue<>();
        for(int i=0; i<score.length; i++){
            pq.offer(new info(score[i], i));
        }
        String[] arr = new String[score.length];
        int pos = 1;
        while(!pq.isEmpty()){
            info curr = pq.poll();
            if(pos == 1){
                arr[curr.idx] = "Gold Medal";
            }
            else if(pos == 2){
                arr[curr.idx] = "Silver Medal";
            }
            else if(pos == 3){
                arr[curr.idx] = "Bronze Medal";
            }
            else{
                arr[curr.idx] = ""+pos;
            }
            pos++;
        }
        return arr;
    }
}