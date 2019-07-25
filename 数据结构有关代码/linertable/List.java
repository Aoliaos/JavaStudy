package com.datastructure.linertable;
/**
 * @PackageName:com.datastructure.linertable
 * @ClassName: InterFaceList线性表接口
 * 和存储结构无关
 * @Description:
 * @author:Dong
 * @data 7月19-019 14:25
 */

public interface List{
    //返回线性表的大小，即元素的个数
    public int size();

    //返回线性表中序号为i的元素
    public Object get(int i);

    //如果线性表为空返回true，否则返回false
    public boolean isEmpty();

    //判断线性表中是否包含数据元素e
    public boolean contains(Object e);

    //返回数据元素e的下标
    public int indexOf(Object e);

    //将元素e插入到线性表中序号为i的位置
    public void add(int i,Object e);

    //将数据元素e插入到线性表末尾
    public void add(Object e);

    //将数据元素e插入到数据元素obj前
    public boolean addBefore(Object obj, Object e);

    //移除序号为i的数据元素
    public boolean remove(int i);

    //移除数据元素e
    public boolean remove(Object e);

    //用e替换线性表中序号为i的数据元素
    public Object replace(int i,Object e);

}

