package bin_search_tree;

import bin_tree.BinTree;

/**
 * @Author: yuisama
 * @Date: 2019-05-27 20:44
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        BinTree<Integer> binTree = new BinSearchTree<>();
        int[] num = new int[] {28,16,13,22,30,29,42};
        for (int i = 0;i < num.length;i++) {
            binTree.add(num[i]);
        }
        binTree.levelOrder();
    }
}
