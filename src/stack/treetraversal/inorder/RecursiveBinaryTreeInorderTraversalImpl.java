package stack.treetraversal.inorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecursiveBinaryTreeInorderTraversalImpl implements BinaryTreeInorderTraversal {
    List<Integer> result;
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();

        if (root != null) dfs(root);

        return Collections.unmodifiableList(result);
    }

    private void dfs(TreeNode node) {
        if (node.left != null) dfs(node.left);
        result.add(node.val);
        if (node.right != null) dfs(node.right);
    }
}
