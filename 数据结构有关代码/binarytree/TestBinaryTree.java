package com.datastructure.binarytree;

/**
 * @PackageName:com.datastructure.binarytree
 * @ClassName: TestBinaryTree
 * @Description:
 * @author:Dong
 * @data 7月20-020 23:41
 */
public class TestBinaryTree {
    public static void main(String[] args){
        //创建一个二叉树
        Node node5 = new Node(5,null,null);
        Node node4 = new Node(4,null,node5);

        Node node3 = new Node(3,null,null);
        Node node7 = new Node(7,null,null);
        Node node6 = new Node(6,null, node7 );

        Node node2 = new Node(2,node3,node6);

        Node node1 = new Node(1,node4,node2);

        BinaryTree btree = new LinkedBinaryTree(node1);

        //判断是否为空
        //System.out.println(btree.isEmpty());

        //先序递归遍历操作  1 4 5 2 3 6 7
        System.out.println("先序递归recursive遍历结果为：");
        btree.preOrderTraverse();
        System.out.println("");

        //中序递归遍历操作 4 5 1 3 2 6 7
        btree.inOrderTraverse();

        //中序遍历非递归操作（借助栈）4 5 1 3 2 6 7
        btree.inOrderByStack();

        //后序递归遍历操作 5 4 3 7 6 2 1
        btree.postOrderTraverse();

        //按照层次遍历（借助队列）1 4 2 5 3 6 7
        btree.levelOrderByStack();

        //查找指定值
        System.out.println(btree.findKey(4));

        //获取二叉树的高度
        System.out.println(btree.getHeight());

        //二叉树的结点个数
        System.out.println(btree.size());
    }
}
