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
    int len = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null)
            return len;
        getLength(root,root.val);
        return len;
    }
    
    public int getLength(TreeNode node, int value){
        if(node==null)
            return 0;
        int len_left = getLength(node.left,node.val);
        int len_right = getLength(node.right,node.val);
        len = Math.max(len,len_left+len_right);
        if(node.val == value)
            return Math.max(len_left,len_right)+1;
        return 0;
    }
}