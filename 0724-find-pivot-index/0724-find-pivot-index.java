class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int lsum = 0;
        int rsum = 0;
        for(int i=0; i<nums.length; i++){
            lsum += nums[i];
            for(int j=i; j<nums.length; j++){
                rsum += nums[j]; 
            }
            if(lsum == rsum){
                return i;
            }
            rsum = 0;
        }
        return -1;
    }
}