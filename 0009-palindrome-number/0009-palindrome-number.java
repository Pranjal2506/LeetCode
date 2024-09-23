class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        if(n < 0){
            return false;
        }
        int re = 0;
        while(n > 0){
            re = (re*10)+n%10;
            n = n/10;
        }
        if(re == x){
            return true;
        }
        return false;
    }
}