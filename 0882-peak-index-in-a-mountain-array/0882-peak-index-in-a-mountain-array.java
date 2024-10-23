class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int peak = 0;
        if(arr.length == 1){
            return arr[0];
        }
        while(start <= end){
            int mid = start+(end-start)/2;
            int curr = arr[mid];
            if(arr.length-1 > mid){
                if(arr[mid] > arr[mid+1]){
                    end = mid-1;
                    peak = mid;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return peak;
    }
}