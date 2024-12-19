class Solution {
    public void moveZeroes(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            if(nums[s] == 0){
                int val = nums[e];
                nums[e] = 0;
                for(int i=s; i<e; i++){
                    if(i == e-1){
                        nums[i] = val;
                        break;
                    }
                    nums[i] = nums[i+1];
                }
                e--;
            }
            if(nums[s] != 0){
                s++;
            }
        }
    }
}