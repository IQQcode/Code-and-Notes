package oj;

/**
 * @Author: yuisama
 * @Date: 2019-06-02 09:21
 * @Description:
 */
public class Solution3 {
    /**
     * 判断以p和q为根结点的两颗二叉树是否完全相同
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (q.val != p.val)
            return false;
        // 此时两棵树根结点不为空且根结点值相等
        // 此时去两棵二叉树的子树中比较
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
