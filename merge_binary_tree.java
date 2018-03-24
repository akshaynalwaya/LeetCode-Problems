/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null)
            return null;
        if(t1==null)
            return t2;
        if(t2==null)
            return t1;
        TreeNode root = new TreeNode(0);
        root.val = getSum(t1,t2);
        TreeNode node = root;
        if(!(t1==null && t2==null)){
            if(t1.left!=null || t2.left!=null)
                node.left = mergeTrees(t1.left,t2.left);
            if(t1.right!=null || t2.right!=null)
                node.right = mergeTrees(t1.right,t2.right);
        }
        return root;
    }
    int getSum(TreeNode n1, TreeNode n2){
        int a = 0;
        int b = 0;
        if(n1!=null)
            a = n1.val;
        if(n2!=null)
            b = n2.val;
        return (a+b);
    }        
}