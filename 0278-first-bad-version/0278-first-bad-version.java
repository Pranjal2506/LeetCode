/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n){
        int st = 1;
        int en = n;
        int ans = -1;
        while(st <= en){
            int mid = st + (en-st)/2;
            if(isBadVersion(mid)){
                ans = mid;
                en = mid -1;
            }else{
                st = mid + 1;
            }
        }
        return ans;
    }
}