package com.rudecrab.demo.common.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/15 16:20
 **/
public class Iterator {
    public static void main(String[] args) {
        int[] ints = new Random().ints(1, 50).distinct().limit(10).toArray();
        System.out.println(ints);
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        String s;
        for (java.util.Iterator iterator = list.iterator() ; iterator.hasNext() ; System.out.print(s)) {
            s = (String) iterator.next();
        }
    }
}
