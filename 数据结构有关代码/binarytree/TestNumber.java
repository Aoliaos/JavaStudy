package com.datastructure.binarytree;

/**
 * @PackageName:com.datastructure.binarytree
 * @ClassName: TestNumber
 * @Description:
 * @author:Dong
 * @data 7月21-021 19:23
 */
public class TestNumber {
    public static void main(String[] args){
        System.out.println(sum(100));
        System.out.println((100+1)*50);

    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }else{
        return n + sum(n-1);
        }
    }
}

