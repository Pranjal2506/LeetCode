class Solution {
    public boolean isPalindrome(int x) {
        String s = ""+x;
        String st = new StringBuilder(s).reverse().toString();
        if(s.equals(st)){
            return true;
        }
        return false;
    }
}