class Solution {
    public int longestConsecutive(int[] nums) {
        int longest_streak = 1;
        int current_streak = 1;
        Arrays.sort(nums);
        
        if(nums.length == 0){
            return 0;
        }

        for(int i =0; i<nums.length-1; i++){
            if(nums[i+1] != nums[i]){
                if(nums[i] == nums[i+1]-1){
                    current_streak += 1;
                }else{
                    longest_streak = Math.max(current_streak, longest_streak);
                    current_streak = 1;
                }
            }
        }
        return Math.max(longest_streak, current_streak);
    }
}