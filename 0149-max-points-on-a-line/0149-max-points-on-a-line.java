class Solution {
    public int maxPoints(int[][] po) {
        int res = 1;
        int n=po.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int dx = po[j][0]-po[i][0];
                int dy = po[j][1]-po[i][1];
                int count=2;
                for(int k=j+1;k<n;k++){
                    if(dy*(po[k][0]-po[j][0]) == dx*(po[k][1]-po[j][1])){
                        count++;
                    }
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }
}