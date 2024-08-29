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
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        return create(nums, start, end);
    }
    TreeNode create(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (end-start)/2 + start;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = create(nums, start, mid-1);
        root.right = create(nums, mid+1, end);

        return root;
    }
}