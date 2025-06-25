class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        findSubset(0, nums, new ArrayList<>(), list);

        return list;
    }

    public static void findSubset(int idx, int[] nums, ArrayList<Integer> current, List<List<Integer>>list){
        if(idx == nums.length){
            list.add(new ArrayList<>(current));
            return;
        }
        findSubset(idx+1, nums, current, list);
        current.add(nums[idx]);
        findSubset(idx+1, nums, current, list);

        current.remove(current.size()-1);
    }
}