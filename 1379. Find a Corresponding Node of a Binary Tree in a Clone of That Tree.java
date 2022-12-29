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
    TreeNode ans;
     public TreeNode Inorder(TreeNode o,TreeNode c,TreeNode target){
        
        if(o!= null ){
            Inorder(o.left,c.left,target);
        
            if(o == target){
                
            ans = c;
            
            }
            
            Inorder(o.right,c.right,target);
        }
        return ans;
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
         return Inorder(original, cloned,target);
          
    }

   
}
