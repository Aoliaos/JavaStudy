package com.datastructure.search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @PackageName:com.datastructure.search
 * @ClassName: TestCollection
 * @Description:
 * @author:Dong
 * @data 7月23-023 14:09
 */
public class TestCollection {
    public static void main(String[] args){
        TreeSet set  = new TreeSet();
        set.add("aaa");
        set.size();
        //set.clear();
        System.out.println(set.size());

        HashSet set2 = new HashSet();
        set2.add("abc");
        set2.add("jack");
        set2.size();
        //set2.clear();
        set2.isEmpty();
        System.out.println(set2);

        HashMap map = new HashMap();
        map.put("cn","China");
        map.put("us","USA");
        System.out.println(map.get("cn"));


    }
}
