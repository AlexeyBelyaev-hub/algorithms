package stack.treetraversal.inorder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IterativeBinaryTreeInorderTraversalImpl2 implements BinaryTreeInorderTraversal {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.addFirst(curr);
                curr = curr.left;
            }

            curr = stack.pollFirst();
            integers.add(curr.val);
            curr = curr.right;
        }

        return integers;
    }
}
