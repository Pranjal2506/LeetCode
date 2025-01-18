class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a,b) -> {
                int freq = map.get(b) - map.get(a);
                if(freq == 0){
                    return a.compareTo(b);
                }
                return freq;
            }
        );
        pq.addAll(map.keySet());
        ArrayList<String> list = new ArrayList<>();
        while(k-- > 0){
            list.add(pq.poll());
        }
        return list;
    }
}