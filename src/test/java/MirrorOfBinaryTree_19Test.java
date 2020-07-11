import datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MirrorOfBinaryTree_19Test {

    @Test
    public void mirrorRecursively() {
        int[] array = {8, 6, 10, 5, 7, 9, 11};
        int[] expectedArray = {8, 10, 6, 11, 9, 7, 5};
        TreeNode root = TreeNode.buildBinaryTree(new TreeNode(), array, 0);

        TreeNode mirrorTreeNode = MirrorOfBinaryTree_19.mirrorRecursively(root);
        int[] mirrorArray = TreeNode.binaryTreeToArray(mirrorTreeNode);


        assertArrayEquals(expectedArray, mirrorArray);
    }

    @Test
    public void mirrorLoop() {
        int[] array = {8, 6, 10, 5, 7, 9, 11};
        int[] expectedArray = {8, 10, 6, 11, 9, 7, 5};
        TreeNode root = TreeNode.buildBinaryTree(new TreeNode(), array, 0);

        TreeNode mirrorTreeNode = MirrorOfBinaryTree_19.mirrorLoop(root);
        int[] mirrorArray = TreeNode.binaryTreeToArray(mirrorTreeNode);


        assertArrayEquals(expectedArray, mirrorArray);
    }
}