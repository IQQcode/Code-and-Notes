package oj;

/**
 * @Author: yuisama
 * @Date: 2019-06-02 09:52
 * @Description:
 */
public class Solution5 {
    /**
     * 返回以root作为根节点的二叉树最大深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        // 求出当前二叉树子树的最大深度
        int maxDepth = Math.max(maxDepth(root.left),
                maxDepth(root.right));
        return maxDepth+1;
    }
}
