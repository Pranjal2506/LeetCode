class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int vals = n;
        int st = 0;
        int end = ans.length-1;
        while(st <= end){
            if(st == end){
                ans[st] = 0;
                break;
            }
            ans[st] = -vals;
            ans[end] = vals;
            st++;
            end--;
            vals--;
        }
        return ans;
    }
}