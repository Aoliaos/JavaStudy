package com.datastructure.binarytree;

/**
 * @PackageName:com.datastructure.binarytree
 * @ClassName: Node
 * @Description:
 * @author:Dong
 * @data 7月20-020 23:14
 */
public class Node {
    //以下三个属性省略private，为方便练习
    Object value;
    Node leftChild;
    Node rightChild;

    public Node() {
    }

    public Node(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }

    public Node(Object value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    //以下为set/get方法
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
