import datastructure.TreeNode;

/**
 * @program: offer
 * @description: 普通二叉树的最近公共祖先
 * @author: Yin Cong
 * @created: 2020/07/19 18:30
 */
public class LowestCommonAncestorCommon_69 {
    public static TreeNode lowestCommonAncestorCommon(TreeNode root, TreeNode p, TreeNode q) {
        /**
         * 在左右子树中查找是否存在p或者q，如果p和q分别在两个子树中，说明跟几点就是最近公共祖先
         * */
        if (root == null || p == root || q == root) {
            return root;
        }
        TreeNode left = lowestCommonAncestorCommon(root.left, p, q);
        TreeNode right = lowestCommonAncestorCommon(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
}
