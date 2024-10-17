class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: bills){
            if(i == 5){
                if(map.containsKey(5)){
                    map.put(5, map.get(5)+1);
                }else{
                    map.put(5,1);
                }
            }
            if(i == 10){
                if(map.containsKey(5) && map.get(5)>=1){
                    map.put(5, map.get(5)-1);
                    if(map.containsKey(10)){
                        map.put(10, map.get(10)+1);
                    }else{
                        map.put(10, 1);
                    }
                }else{
                    return false;
                }
            }
            if(i == 20){
                if(map.containsKey(10) && map.containsKey(5) && map.get(5) >= 1 && map.get(10) >= 1){
                    map.put(5, map.get(5)-1);
                    map.put(10, map.get(10)-1);
                    if(map.containsKey(20)){
                        map.put(20, map.get(20)+1);
                    }else{
                        map.put(20, 1);
                    }
                }else if(map.containsKey(5) && map.get(5) >= 3){
                    map.put(5, map.get(5)-3);
                    if(map.containsKey(20)){
                        map.put(20, map.get(20)+1);
                    }else{
                        map.put(20, 1);
                    }
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}