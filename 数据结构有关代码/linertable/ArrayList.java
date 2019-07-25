package com.datastructure.linertable;
//import jdk.jfr.Description;

import java.util.Arrays;

/**
 * @PackageName:com.datastructure.linertable
 * @ClassName: ArrayList顺序表
 * 底层采用数组，但长度可变
 * @Description:
 * @author:Dong
 * @data 7月19-019 14:47
 */
public class ArrayList implements List{
    private Object[] elementData;//底层是数组，目前没确定长度
    private int size;//元素个数

    public ArrayList(){
        this(4);
        //未指定长度
        //elementData = new Object[]{};
    }
    public ArrayList(int initialCapacity){
        //给数组分配指定数量的空间
        elementData = new Object[initialCapacity];
        //指定元素个数，默认是0；
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if(i<0 || i>=size){
            //throw new RuntimeException("数组越界异常:"+i);
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
        }
        else {
            return elementData[i];
        }
    }

    @Override
    public boolean isEmpty() {
        return size==0;
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
    public String toString(){
        if(size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0;i<size;i++){
            if(i != size-1){
            builder.append(elementData[i]+",");
        }else
            {
                builder.append(elementData[i]);
            }
        }
        builder.append("]");
        return builder.toString();
    }
    @Override
    public void add(int i, Object e) {
        //i的位置要正确
        if(i<0 || i>size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
        }
        if (size == elementData.length) {
            grow();
        }
        for(int j=size;j>i;j--){
            elementData[j] = elementData[j-1];
        }
        //给数组赋值
        //elementData[i++] = e;
        elementData[i] = e;
        size++;
        System.out.println("length="+elementData.length);


    }

    @Override
    public void add(Object e) {
        this.add(size,e);
//        if (size == elementData.length) {
//            grow();
//        }
//        //给数组赋值
//        elementData[size++] = e;
////        elementData[size] = e;
////        size++;
//        System.out.println("length="+elementData.length);
    }
    private void grow(){
        //扩容
//        if(size == elementData.length){
//            //创建一个新数组，长度是元素组二倍
//            Object[] newArr = new Object[elementData.length*2];
//            for(int i=0;i<size;i++){
//                newArr[i] = elementData[i];
//            }
//            elementData = newArr;
//        }
        elementData = Arrays.copyOf(elementData,elementData.length*2);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean remove(int i) {
        return true;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }
}
