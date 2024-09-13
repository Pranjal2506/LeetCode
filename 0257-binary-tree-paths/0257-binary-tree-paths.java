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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> li = new ArrayList<>();
        find(root, li, "");
        return li;
    }
    public void find(TreeNode root, List<String> li, String result){
        if(root == null){
            return;
        }
        result += root.val;
        if(root.right == null && root.left == null){
            li.add(result);
        }
        result += "->";
        find(root.left, li, result);
        find(root.right, li, result);
    }
}