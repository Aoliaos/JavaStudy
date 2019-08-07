package com.datastructure.search;

import java.lang.reflect.Array;

/**
 * @PackageName:com.datastructure.search
 * @ClassName: BinarySearch
 * 非递归
 * 时间复杂度O(log2n)
 * 空间复杂度S(log2n)
 * @Description:
 * @author:Dong
 * @data 7月22-022 21:28
 */
public class BinarySearch {
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
    /**
     *@Author:Dong
     *@Description:   //TODO
     *@Date 21:42 7月22-022
     *@return
     **/
    public static int binarySearch(int[] arr,int key){
        //指定low，high
        int low = 0;
        int high = arr.length - 1;

        //折半查找
        while(low <= high){
            int mid = (low + high)/2;
            if(key == arr[mid]){
                return mid;
            }else if(key < arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}

