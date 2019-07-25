package com.datastructure.linertable;

/**
 * @PackageName:com.datastructure.linertable
 * @ClassName: MyArrayIndexOutOfBoundsException
 * 自定义异常
 * @Description:
 * @author:Dong
 * @data 7月19-019 15:34
 */
public class MyArrayIndexOutOfBoundsException extends RuntimeException{
    public MyArrayIndexOutOfBoundsException(){
        super();
    }
    public MyArrayIndexOutOfBoundsException(String message){
        super(message);
    }
}
