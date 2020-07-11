package datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeNodeTest {

    @Test
    public void buildBinaryTree() {
        int[] array = {8, 6, 10, 5, 7, 9, 11};
        TreeNode root = TreeNode.buildBinaryTree(new TreeNode(), array, 0);

        assertArrayEquals(array, TreeNode.binaryTreeToArray(root));
    }
}