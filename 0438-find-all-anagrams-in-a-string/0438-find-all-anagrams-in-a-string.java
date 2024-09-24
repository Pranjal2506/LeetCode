class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        char[] char_p = p.toCharArray();
        Arrays.sort(char_p);
        String sorted_p = new String(char_p);
        for(int i=0; i<s.length()-(p.length()-1); i++){
            String substr = s.substring(i, i+p.length());
            char[] char_substr = substr.toCharArray();
            Arrays.sort(char_substr);
            String sorted_substr = new String(char_substr);
            if(sorted_substr.equals(sorted_p)){
                ans.add(i);
            }
        }
        return ans;
    }
}