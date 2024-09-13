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
public class ParentDepth{
    TreeNode parent;
    int level;
    public ParentDepth(TreeNode parent, int level){
        this.parent = parent;
        this.level = level;
    }
}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        ParentDepth pd1 = find(root, null, x, 0);
        ParentDepth pd2 = find(root, null, y, 0);
        if(pd1.level == pd2.level){
            if(pd1.parent != pd2.parent){
                return true;
            }
        }
        return false;
    }
    public ParentDepth find(TreeNode root, TreeNode parent, int value, int level){
        if(root == null){
            return null;
        }
        if(root.val == value){
            return new ParentDepth(parent, level);
        }
        ParentDepth left = find(root.left, root, value, level+1);
        if(left != null){
            return left;
        }
        return find(root.right, root, value, level+1);
    }
}