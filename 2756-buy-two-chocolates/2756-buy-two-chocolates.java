class Solution {
    public int buyChoco(int[] prices, int money) {
        int orig_money = money;
        int count = 0;
        Arrays.sort(prices);
        for(int i: prices){
            if(i <= money){
                money -= i;
                count++;
            }
            if(count == 2){
                break;
            }
        }
        if(count < 2){
            return orig_money;
        }else{
            return money;
        }
    }
}