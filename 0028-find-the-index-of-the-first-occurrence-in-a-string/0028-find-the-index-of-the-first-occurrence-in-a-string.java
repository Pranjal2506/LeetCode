class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length() - needle.length()+1; i++){
            String curr = haystack.substring(i, i+needle.length());
            System.out.println(curr);
            if(curr.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}