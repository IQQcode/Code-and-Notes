package bin_tree;

/**
 * @author: yuisama
 * @date: 2019-05-27 20:25
 * @description:二叉树通用接口
 */
public interface BinTree<E> {
    void add(E e);
    boolean contains(E e);

    /**
     * 前序遍历
     */
    void preOrder();

    /**
     * 中序遍历
     */
    void inOrder();

    /**
     * 后序遍历
     */
    void postOrder();

    /**
     *层序遍历
     */
    void levelOrder();
    /**
     * 取得最小值
     * @return
     */
    E getMin();
    E getMax();
    E removeMin();
    E removeMax();

    /**
     * 移除二叉树中指定值的节点
     * @param e
     * @return
     */
    void remove(E e);
    int size();
}
