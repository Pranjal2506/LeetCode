class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int long_length = 0;
        for(int num: nums){
            if(map.containsKey(num+1)){
                map.put(num+1, false);
            }
            if(map.containsKey(num-1)){
                map.put(num, false);
            }else{
                map.put(num, true);
            }            
        }
        for(int i: map.keySet()){
            if(map.get(i) == true){
                list.add(i);
            }
        }
        for(int i: list){
            int curr_length = 1;
            int curr_num = i;
            while(map.containsKey(curr_num + 1)){
                curr_length ++;
                curr_num ++;
            }
            long_length = Math.max(curr_length, long_length);
        }
        return long_length;
    }
}