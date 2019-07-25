package com.datastructure.linertable;

/**
 * @PackageName:com.datastructure.linertable
 * @ClassName: TestArrayList
 * @Description:
 * @author:Dong
 * @data 7月19-019 14:51
 */
public class TestArrayList {
    public static void main(String args[]) {
        //java.util.ArrayList();
        List list = new ArrayList();

        list.add(123);
        list.add(321);
        list.add(456);
        list.add(567);

        list.add(678);
        list.add(987);
        list.add(5,9999);


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("获取第5位数据元素为："+list.get(5));
        System.out.println("打印全部元素：");
        System.out.println(list.toString());
    }
}