import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }else{
                map1.put(ch, 1);
            }
        }
        for(int i=0; i<s.length(); i++){
            char ch2 = s.charAt(i);
            map2.put(ch2, i);
        }
        for(Character ch: map1.keySet()){
            if(map1.get(ch) != 1){
                map2.remove(ch);
            }
        }
        Collection<Integer> values = map2.values();
        if(!values.isEmpty()){
            Integer min = Collections.min(values);
            if(min >= 0){
                return min;
        }
    }
    return -1;
}
}