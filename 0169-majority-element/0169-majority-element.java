class Solution {
    public int majorityElement(int[] nums) {
        int max = nums.length /2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i)+1);
            }
        }
        for(Integer i: map.keySet()){
            if(map.get(i) > max){
                return i;
            }
        }
        return -1;
    }
}