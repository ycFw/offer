import datastructure.TreeNode;

/**
 * @program: offer
 * @description: 输入一颗二叉树，输出其镜像
 * @author: Yin Cong
 * @created: 2020/07/11 22:14
 */
public class MirrorOfBinaryTree_19 {
    public static TreeNode mirrorRecursively(TreeNode root) {
        if (root == null) return root;
        TreeNode left = root.left;
        root.left = mirrorRecursively(root.right);
        root.right = mirrorRecursively(left);
        return root;
    }
}
