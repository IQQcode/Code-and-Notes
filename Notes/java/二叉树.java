    public void remove(E e) {
         root = remove(root,e);
        }

    /**
     * 删除以node为根节点且值为e的节点
     * 返回删除后的二叉树根节点
     * @param node
     * @return
     */

    private Node remove(Node node,E e) {
        if (node == null)
            return null;
        if (e.compareTo(node.data) < 0) {
            node.left = remove(node.left,e);
        }
        if (e.compareTo(node.data) > 0) {
            node.right = remove(node.right,e);
        }
        // 此时node就为需要删除的节点
        else {
            // 若此时节点只有一边孩子
            if (node.left != null && node.right == null) {
                Node leftNode = node.left;
                size --;
                node.left = null;
                return leftNode;
            }
            if (node.right != null && node.left == null) {
                Node rightNode = node.right;
                size --;
                node.right = null;
                return rightNode;
            }
            //此时节点俩边都有孩子
            if (node.left != null && node.right != null) {
                // 找到前驱或后继节点
                Node successor = getMinNode(node.right);
                successor.left = node.left;
                successor.right = removeMinNode(node.right);
                node.left = node.right = null;
                return successor;
            }
        }
        return node;
    }




floor节点： 小于该值在二叉树的最大值节点
ceil:大于该值在二叉树中的最小节点

rank：给每个节点排序输出
select：排序

二分搜索树：结构不做要求，对值有要求

查找的时间复杂度：O(height) 与树高成正比
O(log2 n): n为节点个数

二分搜索极端情况：


平衡二叉树：每个节点的左右俩个孩子高度差不超过 1











