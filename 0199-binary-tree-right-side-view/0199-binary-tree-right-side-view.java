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
    public List<Integer> rightSideView(TreeNode root) {
        int level = 0;
        List<Integer>list = new ArrayList<>();
        tolist(root, list, level);
        return list;
    }
    public void tolist(TreeNode root, List<Integer>list,int level){
        if(root == null){
            return;
        }
        if(level == list.size()){
            list.add(root.val);
        }
        tolist(root.right, list, level+1);
        tolist(root.left, list, level+1);
    }
}