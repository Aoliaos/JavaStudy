package com.datastructure.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @PackageName:com.datastructure.sort
 * @ClassName: QuickSortBySelf
 * @Description:
 * @author:Dong
 * @data 7月23-023 19:29
 */
public class QuickSortByMyself {
    public static int patition(int[] arr,int low,int high){
        int i = low;
        int j = high;

        int x = arr[low];//基准值

        while(i < j){
            while(arr[j] >= x && i < j){
                j--;
            }
            if(i < j){
                arr[i] = arr[j];
                i++;
            }

            while(arr[i] < x && i<j){
                i++;
            }
            if(i<j){
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = x;
        return i;
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int index = patition(arr,low,high);
            //leftpart
            quickSort(arr,low,index-1);

            //rightpart
            quickSort(arr,index+1,high);
        }
    }

    public static void quickSort(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr,low,high);

    }

    //主函数
    public static void main(String[] args){
         int [] array = {72,6,57,88,60,42,83,73,48,85,6};
         System.out.println(Arrays.toString(array));
         
         quickSort(array);

         System.out.println(Arrays.toString(array));
        }
}
