package oj;

/**
 * @Author: yuisama
 * @Date: 2019-06-02 09:27
 * @Description:另一颗树的子树 = 查找二叉树中制定值的节点 + 判断两颗二叉树是否完全相同
 */
public class Solution4 {
    /**
     * 找到t的根结点在s中的位置
     * 判断两颗二叉树是否相同
     * @param s
     * @param t
     * @return
     */

public boolean isSubtree(TreeNode s, TreeNode t) {
    // 找到s中根结点值也为t的子节点
    boolean flag = false;
    // 递归出口条件
    if (s != null) {
        // 找到s中值与t的根节点相同的子节点
        if (s.val == t.val)
            flag = isSameTree(s,t);
        // 此时s还未遍历完,仍未找到s中值也为t的节点
        // 递归的从s的子树中继续寻找
        if (!flag) {
            flag = isSubtree(s.left,t) || isSubtree(s.right,t);
        }
    }
    return flag;

}
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