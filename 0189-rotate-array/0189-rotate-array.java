class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if((i+k) < nums.length){
                nums[i+k] = arr[i]; 
            }else{
                nums[(i+k) % nums.length] = arr[i];
            }
        }
    }
}