class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    set.add(list);
                }
            }
        }
        for(ArrayList<Integer> li: set){
            System.out.println(li);
            int r = li.get(0);
            int c = li.get(1);
            for(int i = 0; i< matrix[0].length; i++){
                matrix[r][i] = 0;
            }
            for(int i = 0; i< matrix.length; i++){
                matrix[i][c] = 0;
            }
        }
    }
}