package com.datastructure.binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @PackageName:com.datastructure.binarytree
 * @ClassName: LinkedListBinaryTree
 * @Description:
 * @author:Dong
 * @data 7月20-020 23:41
 */
public class LinkedBinaryTree implements BinaryTree{

    private Node root;

    public LinkedBinaryTree() {
    }

    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        System.out.println("该二叉树的结点个数为：");
        return this.size(root);
    }
    private int size(Node root){
        if(root == null){
            return 0;
        }else{
            //获取左子树结点数size
            //int nl = this.size(root.leftChild);
            //获取右子树结点数size
            //int nr = this.size(root.rightChild);
            //返回左右子树结点数+1
            //return nl + nr + 1;
            return 1 + size(root.leftChild) + size(root.rightChild);
         }
    }

    @Override
    public int getHeight() {
        System.out.println("该二叉树的高度为：");
        return this.getHeight(root);
    }

    private int getHeight(Node root){
        if(root == null){
            return 0;
        }else{
            //获取左子树高度
            int nl = this.getHeight(root.leftChild);
            //获取右子树高度
            int nr = this.getHeight(root.rightChild);
            //返回左右子树高度较大值
            return nl > nr ? nl+1:nr+1;
        }
    }

    @Override
    public Node findKey(int value) {
        System.out.println("查找指定值为：");
        return this.findKey(value,root);
    }

    public Node findKey(Object value,Node root){

        if(root == null){//结点为空，可能是整个树的根结点，也可能是递归调用中的左孩子或者右孩子
            return null;
        }else if(root != null && root.value == value){//递归条件
            return root;
            }else {//递归体
            Node node1 = this.findKey(value,root.leftChild);
            Node node2 = this.findKey(value,root.rightChild);
                if(node1 != null && node1.value == value){
                return node1;
                }else if(node2 != null && node2.value == value){
                    return node2;
                    }else{
                        return null;
                        }
                    }
    }

    @Override
    public void preOrderTraverse() {
        //输出根结点,中序后序借助辅助类可优化
        if (root != null) {
            //1.输出根结点的值
            System.out.print(root.value +" ");

            //2.对左子树进行先序遍历
            //构建一个二叉树，根是左子树的根
            BinaryTree leftTree = new LinkedBinaryTree(root.leftChild);
            leftTree.preOrderTraverse();

            //3.对右子树进行先序遍历
            //构建一个二叉树，根是右子树的根
            BinaryTree rightTree = new LinkedBinaryTree(root.rightChild);
            rightTree.preOrderTraverse();
        }
    }

    @Override
    public void inOrderTraverse() {
        System.out.println("中序递归recursive遍历结果为：");
        this.inOrderTraverse(root);
        System.out.println(" ");

    }
    private void inOrderTraverse(Node root){
        //中序遍历
        if(root != null){
            //遍历左子树
            this.inOrderTraverse(root.leftChild);
            //输出根的值
            System.out.print(root.value +" ");
            //遍历右子树
            this.inOrderTraverse(root.rightChild);
        }
    }

    @Override
    public void postOrderTraverse() {
        System.out.println("后序递归recursive遍历结果为：");
        this.postOrderTraverse(root);
        System.out.println("");

    }

    @Override
    public void postOrderTraverse(Node node) {
        if(node != null){
            //后序遍历
            //遍历左子树
            this.postOrderTraverse(node.leftChild);
            //遍历右子树
            this.postOrderTraverse(node.rightChild);
            //输出根的值
            System.out.print(node.value+" ");
        }

    }

    @Override
    public void inOrderByStack() {
        System.out.println("中序非递归ByStack遍历为：");
        //创建栈
        Deque<Node> stack = new LinkedList<Node>();
        Node current = root;
        while(current != null || !stack.isEmpty()){
            while(current !=null){
                stack.push(current);
                current = current.leftChild;
            }

            if(!stack.isEmpty()){
                current = stack.pop();
                System.out.print(current.value + " ");
                current = current.rightChild;
            }
        }
        System.out.println("");

    }

    @Override
    public void preOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    @Override
    public void levelOrderByStack() {
        //队列实现层序遍历
        System.out.println("层序非递归（queue）遍历输出为:");
        if(root == null){ return; }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(queue.size() != 0)
        {
            int len = queue.size();
            for(int i=0; i<len; i++){
                Node temp = queue.poll();
                System.out.print(temp.value + " ");
                if(temp.leftChild != null){queue.add(temp.leftChild);}
                if(temp.rightChild != null){queue.add(temp.rightChild);}
            }
        }
        System.out.println("");


    }
}
