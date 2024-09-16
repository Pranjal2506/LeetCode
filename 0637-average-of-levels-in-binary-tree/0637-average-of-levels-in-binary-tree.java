/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> li = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return li;
        }
        q.add(root);
        List<List<Integer>> listt = new ArrayList<>();
        while(!q.isEmpty()){
            int k = 1;
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            while(k <= size){
                TreeNode curr = q.poll();
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                k++;
            }
            listt.add(list);
        }
        for(List i: listt){
            System.out.println(i);
            li.add(evaluate(i));
        }
        return li;
    }
    public double evaluate(List<Integer> li){
        double k = 0;
        double ans = 0;
        for(int i: li){
            ans += i;
            k++;
        }
        System.out.print(ans +"/" + k);
        return ans/k;
    }
}