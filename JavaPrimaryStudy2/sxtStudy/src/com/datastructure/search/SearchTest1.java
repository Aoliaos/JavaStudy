package com.datastructure.search;

import static java.util.Arrays.sort;

/**
 * @PackageName:com.datastructure.search
 * @ClassName: SearchTest1
 * @Description:
 * @author:Dong
 * @data 7月22-022 21:05
 */
public class SearchTest1 {
    public static void main(String[] args){
        //给定数组，
        int [] scoreArr = {86,89,76,82,98,75,73,99};
        // 指定要查找的值
        int score = 89;
        //完成查找
        sort(scoreArr);
        for(int i = 0;i<scoreArr.length; i++){
            System.out.print("排序结果：" + scoreArr[i] + " ");
        }
        int index = search(scoreArr,score);
        //输出结果
        if(index == -1){
            System.out.println("该分数不存在！");
        }else{
            System.out.println("查找的分数"+ score + "的索引是："+index);
        }
    }
    public static int search(int[] arr,int key){
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        return index;
    }
}
