import datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LowestCommonAncestorCommon_69Test {

    @Test
    public void lowestCommonAncestorCommon() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = TreeNode.buildBinaryTree(new TreeNode(), array, 0);

        TreeNode p = new TreeNode(4);
        TreeNode q = new TreeNode(5);

        int[] array1 = TreeNode.binaryTreeToArray(new TreeNode(2));
        int[] array2 = TreeNode.binaryTreeToArray(LowestCommonAncestorCommon_69.lowestCommonAncestorCommon(new TreeNode(2), p, q));

//        assertArrayEquals(array1, array2);
    }
}