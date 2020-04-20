package com.rudecrab.demo.common.designPattern.decorator;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/20 13:51
 **/
public class Dog implements Move {
    @Override
    public void run() {
        System.out.println("这是一条狗");
    }
}
