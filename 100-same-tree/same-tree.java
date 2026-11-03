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
    // boolean fun(TreeNode t1, TreeNode t2){
    //     if(t1==null && t2==null) return true;
    //     if(t1==null || t2 == null) return false;
    //     if(t1.val!=t2.val) return false;
    //     if(t1.left!=t2.left) return false;
    //     if()
    //     return true;
    // }
    public boolean isSameTree(TreeNode r1, TreeNode r2) {
       if(r1==null && r2==null) return true;
       if(r1==null || r2==null) return false;
       if(r1.val != r2.val) return false;
       if(!isSameTree(r1.left,r2.left)) return false;
       if(!isSameTree(r1.right,r2.right)) return false;
       return true;

    }
}