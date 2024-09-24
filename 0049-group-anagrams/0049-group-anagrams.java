class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String key = findKey(str);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        for(String s: map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
    public String findKey(String str){
        int[] arr = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[ch-'a'] = arr[ch-'a'] + 1;
        }
        String st = "";
        for(int i=0; i<arr.length; i++){
            st = st+ arr[i]+",";
        }
        return st;
    }
}