package stack.treetraversal.inorder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IterativeBinaryTreeInorderTraversalImpl implements BinaryTreeInorderTraversal {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> integers = new ArrayList<>();
        if (root == null) return integers;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        Set<TreeNode> visited = new HashSet<>();

        stack.addFirst(root);

        while (!stack.isEmpty()) {
            TreeNode currNode = stack.pollFirst();

            if(currNode.left != null && !visited.contains(currNode.left)) {
                stack.addFirst(currNode);
                stack.addFirst(currNode.left);
            } else {
                visited.add(currNode);
                integers.add(currNode.val);
                if (currNode.right != null && !visited.contains(currNode.right))
                    stack.addFirst(currNode.right);
            }

        }

        return integers;
    }
}
