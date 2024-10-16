class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int idx=0;
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] %2 == 0){
                arr[idx] = nums[i];
                idx++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(nums[i] %2!=0){
                arr[idx] = nums[i];
                idx++;
            }
        }
        return arr;
    }
}