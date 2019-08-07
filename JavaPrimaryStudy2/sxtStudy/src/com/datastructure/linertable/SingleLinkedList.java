package com.datastructure.linertable;

import static java.util.Spliterators.iterator;

/**
 * @PackageName:com.datastructure.linertable
 * @ClassName: SingleLinkedList
 * @Description:
 * @author:Dong
 * @data 7月19-019 21:12
 */
public class SingleLinkedList implements List {
    private Node head = new Node();//头结点，不存储数据，为编程方便
    private int size;//一共几个结点

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        //需要从头结点开始进行查找
        Node p = head;
        for(int j = 0; j<=i; j++){
            p = p.next;
        }
        return p.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        //如果i位置越界，抛出异常
        if (i < 0 || i > size) {
            throw new MyArrayIndexOutOfBoundsException("i位置越界异常：" + i);
        }
        //找到一个结点，从head结点开始
//        if (isEmpty()) {
//            throw new RuntimeException("结点为空");
//        } else
            {
            Node p = head;
            for (int j = 0; j < i; j++) {
                p = p.next;
            }
            //1.新创建一个结点
            Node newNode = new Node();
            newNode.data = e;
            //newNode.next = null; //默认为null，可省略

            //2.指明新结点的直接后继结点
            newNode.next = p.next;

            //3.指明新结点的直接前驱结点
            p.next = newNode;

            //size++,元素个数增加1；
            size++;
        }
    }

    @Override
    public void add(Object e) {
        this.add(size,e);

    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean remove(int index){
        if(index<1 || index>size ){
            throw new MyArrayIndexOutOfBoundsException("下标越界："+index);
        }
        if(index == 1){
            head = head.next;
            return true;
        }
        Node preNode = head;
        //Node curNode = head.next;
        int i = 2;
        while(preNode.next != null){
            if(i == index){ //寻找删除结点
                preNode.data = preNode.next.data;
                preNode.next = preNode.next.next;
                //preNode.next = curNode.next;//待删除结点的前结点指向待删除结点的后结点
                return true;
            }
            //当前结点向和前结点同时向后移
            i++;
            preNode = preNode.next;
            //curNode =curNode.next;
        }
        return false;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString(){
        if(size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        Node p = head.next;
        builder.append("[");
        for(int i=0; i<size; i++){
            if(i != size - 1){
                builder.append(p.data +",");
            }else
                {
                    builder.append(p.data);
                }
            //移动指针到下一个结点
            p = p.next;
        }
        builder.append("]");
        return builder.toString();
    }

}
