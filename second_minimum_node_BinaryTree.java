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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)
            return -1;
        int[] result = new int[2];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        result[0] = root.val;
        result[1] = Integer.MAX_VALUE;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.val < result[0]){
                result[1] = result[0];
                result[0] = node.val;
            }
            else if(node.val > result[0] && node.val < result[1]){
                result[1] = node.val;
            }
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
        if(result[1]==Integer.MAX_VALUE)
            return -1;
        return result[1];
    }
}