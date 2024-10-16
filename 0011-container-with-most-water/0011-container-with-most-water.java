class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max_area = 0;
        while(left < right){
            int curr_area = 0;
            int mult = Math.min(height[left], height[right]);
            curr_area = mult * (right-left);
            max_area = Math.max(curr_area, max_area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_area;
    }
}