class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int arr[] = new int[nums.length];
        for(int i: nums){
            if(i %2 == 0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        System.out.println(even);
        System.out.print(odd);
        for(int i=0; i<even.size(); i++){
            arr[i] = even.get(i);
        }
        for(int i=0; i<odd.size(); i++){
            arr[i + even.size()] = odd.get(i);
        }
        for(int i: arr){
            System.out.println(i);
        }
        return arr;
    }
}