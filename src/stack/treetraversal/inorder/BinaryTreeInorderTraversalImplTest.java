package stack.treetraversal.inorder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;

class BinaryTreeInorderTraversalImplTest {

    @Test
    void inorderTraversal1() {
        inorderTraversal(new RecursiveBinaryTreeInorderTraversalImpl());
    }
    @Test
    void inorderTraversal2() {
        inorderTraversal(new IterativeBinaryTreeInorderTraversalImpl());
    }
    @Test
    void inorderTraversal3() {
        inorderTraversal(new IterativeBinaryTreeInorderTraversalImpl2());
    }

    void inorderTraversal(BinaryTreeInorderTraversal btit) {
        //[1,null,2,3]
        //[1,3,2]
        /**
         *        1
         *      /   \
         *    null   2
         *          /\
         *         3 null
         *
         *         Stack
         *
         *
         *
         *          1
         */
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        root.right = new BinaryTreeInorderTraversal.TreeNode(2);
        root.right.left = new BinaryTreeInorderTraversal.TreeNode(3);

        List<Integer> result = btit.inorderTraversal(root);
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals(1, result.get(0));
        Assertions.assertEquals(3, result.get(1));
        Assertions.assertEquals(2, result.get(2));
    }

}