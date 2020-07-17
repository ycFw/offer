import datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: offer
 * @description: 输入一颗二叉树，输出其镜像
 * @author: Yin Cong
 * @created: 2020/07/11 22:14
 */
public class MirrorOfBinaryTree_19 {
    public static TreeNode mirrorRecursively(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = root.left;
        root.left = mirrorRecursively(root.right);
        root.right = mirrorRecursively(left);
        return root;
    }

    public static TreeNode mirrorLoop(TreeNode root) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }
}
