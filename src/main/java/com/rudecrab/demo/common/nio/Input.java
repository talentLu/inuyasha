package com.rudecrab.demo.common.nio;

import java.util.Scanner;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/3/24 14:28
 **/
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("请输入一个整数");
        //int a=scanner.nextInt();
        System.out.println("请输入一个字符");
        String b=scanner.next();
        System.out.println("您打了"+b+"一拳");

    }
}
