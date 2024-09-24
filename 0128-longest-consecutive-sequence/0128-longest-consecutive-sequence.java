class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest_streak = 0;

        for(int num: nums){
            if(!set.contains(num-1)){
                int curr_num = num;
                int curr_streak = 1;

                while(set.contains(curr_num+1)){
                    curr_num++;
                    curr_streak++;
                }
                longest_streak = Math.max(curr_streak, longest_streak);
            }
        }
        return longest_streak;
    }
}