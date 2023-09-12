package stack.treetraversal.inorder;

import java.util.List;

public interface BinaryTreeInorderTraversal {

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
     
    
     List<Integer> inorderTraversal(TreeNode root);
}
