class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: nums){
            int val = map.get(i);
            if(val > (n/3) && !list.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}