class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        h.put(inorder[i],i);
        return solve(preorder,0,preorder.length-1,inorder,0,inorder.length-1,h);
    }
    TreeNode solve(int[] pre,int ps,int pe,int []in,int is,int ie,HashMap<Integer,Integer> h)
    {
        if(ps>pe || is>ie)
        return null;
        TreeNode root=new TreeNode(pre[ps]);
        int val=h.get(pre[ps]);
        int left = val-is;
        root.left=solve(pre,ps+1,ps+left,in,is,val-1,h);
        root.right=solve(pre,ps+left+1,pe,in,val+1,ie,h);
        return root;
    }
}