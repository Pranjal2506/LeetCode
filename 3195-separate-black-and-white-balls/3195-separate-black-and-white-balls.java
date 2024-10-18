class Solution {
    public long minimumSteps(String s) {
        long zeros = 0;
        long ones = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                ones++;
            }else{
                zeros += ones;
            }
        }
        return zeros;
    }
}