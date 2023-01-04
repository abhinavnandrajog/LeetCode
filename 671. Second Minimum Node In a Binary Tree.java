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
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        getInorder(root,list);
        Collections.sort(list);
        
        int a = -1;
        for(int i = 1;i<list.size();i++){
            if(list.get(i)>list.get(i-1)){
            a = list.get(i);
            System.out.println(a);
            break;
            }else{
                continue;
            }
        }
        return a;
    } 
    public void getInorder(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        getInorder(root.left,list);
        list.add(root.val);
        getInorder(root.right,list);
        
        
    }
}
