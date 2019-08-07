package com.datastructure.search;

/**
 * @PackageName:com.datastructure.search
 * @ClassName: BinarySearchByRecursive
 * 递归
 * 时间复杂度O(log2n)
 * 空间复杂度S(1)
 * @Description:
 * @author:Dong
 * @data 7月22-022 22:14
 */
public class BinarySearchByRecursive {
    public static void main(String[] args){
        //给定数组
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        //给定查找的值
        int key = 10;

        int index = -1;
        //查找
        index = binarySearch(array,key);

        //输出结果
        if(index ==-1){
            System.out.println("查找值不存在");
        }else{
            System.out.println(key + "的索引 是：" + index);
        }
    }
    public static int binarySearch(int[] array,int key){
        int low = 0;
        int high = array.length - 1;
        return binarySeach(array, key, low, high);
    }

    public static int binarySeach(int[] array,int key,int low,int high){
        if(low > high){return -1;}
        int mid = (low + high)/2;
        if(key == array[mid]){
            return mid;
        }else if(key < array[mid]){
            return binarySeach(array,key,low,mid - 1);
        }else{
            return binarySeach(array,key,mid + 1,high);
        }
    }
}
