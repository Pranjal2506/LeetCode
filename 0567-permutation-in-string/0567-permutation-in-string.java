class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int arr1[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
        }
        for(int i=0; i<=s2.length() - s1.length(); i++){
            String new_str = s2.substring(i, i+s1.length());
            int new_arr[] = new int[26];
            for(int j=0; j<new_str.length(); j++){
                new_arr[new_str.charAt(j) - 'a']++;
            }
            if(Arrays.equals(new_arr, arr1)){
                return true;
            }
        }
        return false;
    }
}