import datastructure.TreeNode;

/**
 * @program: offer
 * @description: 二叉查找树的最近公共祖先
 * @author: Yin Cong
 * @created: 2020/07/19 18:30
 */
public class LowestCommonAncestorBST_68 {
    public  static  TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        if (p == root || q == root) {
            return root;
        }
        //都在左子树中
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestorBST(root.left, p, q);
        }
        //都在右子树中
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestorBST(root.right, p, q);
        }
        return root;
    }
}
