class Solution {
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(i < s.length()-1 && map.get(curr) < map.get(s.charAt(i+1))){
                result -= map.get(curr);
            }else{
                result += map.get(curr);
            }
        }
        return result; 
    }
}