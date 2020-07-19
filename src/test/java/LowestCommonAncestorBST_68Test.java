import com.sun.xml.internal.ws.api.server.SDDocument;
import datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LowestCommonAncestorBST_68Test {

    @Test
    public void lowestCommonAncestorBST() {
        int[] array = {4, 2, 6, 1, 3, 5, 7};
        TreeNode root = TreeNode.buildBinaryTree(new TreeNode(), array, 0);

        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(6);

        int[] array1 = TreeNode.binaryTreeToArray(new TreeNode(4));
        int[] array2 = TreeNode.binaryTreeToArray(LowestCommonAncestorBST_68.lowestCommonAncestorBST(new TreeNode(4), p, q));

        assertArrayEquals(array1, array2);
    }
}