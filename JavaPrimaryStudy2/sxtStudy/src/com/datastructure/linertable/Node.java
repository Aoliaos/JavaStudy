package com.datastructure.linertable;

/**
 * @PackageName:com.datastructure.linertable
 * @ClassName: Node
 * @Description:
 * @author:Dong
 * @data 7月19-019 21:17
 */
public class Node {
//    private Object data;
//    private Node next;//应当设置为私有，为学习方便暂时不设私有，如下
    Object data;
    Node head;
    Node next;

    public Node(){
    }

    public Node(Object data) {
        super();
        this.data = data;
    }

    public Node(Object data,Node next){
        super();
        this.data = data;
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

}
