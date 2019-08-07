package com.datastructure.binarytree;

/**
 * @PackageName:com.datastructure.binarytree
 * @ClassName: IBinaryTree 二叉树接口
 * 可以有不同的实现类，每个类可以使用不同的存储结构，比如顺序结构，链式结构
 * @Description:
 * @author:Dong
 * @data 7月20-020 23:26
 */
public interface BinaryTree {

    //是否为空
    public boolean isEmpty();

    //获取树结点数量
    public int size();

    //获取树的高度
    public int getHeight();

    //查找指定值的结点
    public Node findKey(int value);

    //前序递归遍历操作
    public void preOrderTraverse();

    //中序递归遍历操作
    public void inOrderTraverse();

    //后序递归遍历操作
    public void postOrderTraverse();

    //后序递归遍历操作,有参数
    public void postOrderTraverse(Node node);


    //中序遍历非递归操作
    public void inOrderByStack();

    //前序遍历非递归操作
    public void preOrderByStack();

    //后序遍历非递归操作
    public void postOrderByStack();

    //按照层次遍历
    public void levelOrderByStack();

}

