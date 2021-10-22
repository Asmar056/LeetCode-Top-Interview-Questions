package SymmetricTree101;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode t1, TreeNode t2){
        if (t1 == null || t2 == null) return t1 == t2;
        return (t1.val == t2.val) && isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
    }
}
