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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        if(root == null){
            return li;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> listt = new ArrayList<>();
        while(!q.isEmpty()){
            int k = 1;
            int size = q.size();
            List<Integer> list = new ArrayList<>();
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
            li.add(evaluate(i));
        }
        return li;
    }
    public int evaluate(List<Integer> lii){
        int ans = lii.get(0);
        for(int i: lii){
            if(i > ans){
                ans = i;
            }
        }
        return ans;
    }
}