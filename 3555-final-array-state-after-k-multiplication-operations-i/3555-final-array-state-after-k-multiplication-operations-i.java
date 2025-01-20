class Solution {
    class Element{
        int data;
        int idx;
        Element(int data, int idx){
            this.data = data;
            this.idx = idx;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Element> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.data != b.data){
                    return a.data-b.data;
                }
                return a.idx - b.idx;
            }
        );
        for(int i=0; i<nums.length; i++){
            pq.offer(new Element(nums[i], i));
        }
        while(k-- >0){
            Element n = pq.poll();
            int an = n.data * multiplier;
            pq.offer(new Element(an, n.idx));
        }
        int ans[] = new int[nums.length];
        for(int i=0; i<ans.length; i++){
            Element el = pq.poll();
            ans[el.idx] = el.data;
        }
        return ans;
    }
}