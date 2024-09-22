class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>  li = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] char_str = str.toCharArray();
            Arrays.sort(char_str);
            String fin_str = new String(char_str);
            if(!map.containsKey(fin_str)){
                map.put(fin_str, new ArrayList<>());
            }
            map.get(fin_str).add(str);
        }
        for(List<String> vals: map.values()){
            li.add(vals);
        }
        return li;
    }
}