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
    public String tree2str(TreeNode t) {
        if(t==null)
            return "";
        StringBuilder result = new StringBuilder();
        result.append(t.val);
        if(t.left!=null){
            result.append("(");
            result.append(tree2str(t.left));
            result.append(")");
        }
        else if(t.right!=null)
            result.append("()");
        if(t.right!=null){
            result.append("(");
            result.append(tree2str(t.right));
            result.append(")");
        }
        return result.toString();
    }
}