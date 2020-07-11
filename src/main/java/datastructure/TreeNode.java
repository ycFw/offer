package datastructure;

import com.sun.deploy.security.MacOSXDeployNTLMAuthCallback;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import sun.util.BuddhistCalendar;

import javax.xml.soap.Node;
import java.awt.image.AreaAveragingScaleFilter;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;

/**
 * @program: offer
 * @description: 二叉树数据结构
 * @author: Yin Cong
 * @created: 2020/07/11 22:09
 */
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(int value) {
        this.val = value;
    }

    public TreeNode() {

    }

    //用数组生成二叉查找树
    public static TreeNode buildBST(int[] nums) {
        TreeNode root = new TreeNode(nums[0]);
        for (int i = 1; i < nums.length; i++) {

        }
        return root;
    }

    //用数组生成普通二叉树
    public static TreeNode buildBinaryTree(TreeNode root, int[] array, int index) {
        if (index > array.length / 2) return root;
        if (index == 0) root.val = array[0];
        int indexLeft = index * 2 + 1, indexRight = index * 2 + 2;
        if (indexLeft < array.length) {
            root.left = new TreeNode(array[indexLeft]);
            buildBinaryTree(root.left, array, indexLeft);
        }
        if (indexRight < array.length) {
            root.right = new TreeNode(array[indexRight]);
            buildBinaryTree(root.right, array, indexRight);
        }
        return root;
    }

    //二叉树输出为数组
    public static int[] binaryTreeToArray(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node == null) continue;
                list.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
