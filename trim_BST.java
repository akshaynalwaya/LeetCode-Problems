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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null)
            return root;
        if(root.val > R){
            root.right = null;
            root = trimBST(root.left,L,R);
        }
        else if(root.val < L){
            root.left = null;
            root = trimBST(root.right,L,R);
        }
        else{
            root.left = trimBST(root.left,L,R);
            root.right = trimBST(root.right,L,R);
        }
        return root;
    }
}