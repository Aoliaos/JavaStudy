package com.datastructure.linertable;
/**
 * @PackageName:com.datastructure.linertable
 * @ClassName: TestArrayList
 * @Description:
 * @author:Dong
 * @data 7月19-019 14:51
 */
public class TestSingleLinkedList {
    public static void main(String[] args) {
        List list = new SingleLinkedList();

        list.add(123);
        list.add(321);
        list.add(456);
        list.add(567);
        list.add(258);

        list.add(678);
        list.add(987);
        System.out.println(list.toString());
        System.out.println("元素个数：" + list.size());
        list.add(2,9999);
        //list.remove(4);



        System.out.println("是否为空：" + list.isEmpty());
        //System.out.println("获取下标为4数据元素为："+list.get(4));

        System.out.println("打印全部元素：");
        System.out.println(list.toString());
        System.out.println("元素个数：" + list.size());
    }
}