/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> res = new ArrayList<Integer>();
    Integer prev;
    int max_count = 0,curr_count = 0;
    public int[] findMode(TreeNode root) {
        inorderTraversal(root);
        int[] result = new int[res.size()];
        for(int i=0;i<res.size();i++)
            result[i] = res.get(i);
        return result;
    }    
    public void inorderTraversal(TreeNode node){
        if(node == null)
            return;
        inorderTraversal(node.left);
        if(prev!=null && node.val == prev)
            curr_count++;
        else
            curr_count = 1;
        if(curr_count == max_count)
            res.add(node.val);
        else if(curr_count > max_count){
            max_count = curr_count;
            res = new ArrayList<>();
            res.add(node.val);
        }
        prev = node.val;
        inorderTraversal(node.right);
    }
}