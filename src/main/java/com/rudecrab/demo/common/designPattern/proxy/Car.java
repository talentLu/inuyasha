package com.rudecrab.demo.common.designPattern.proxy;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/15 15:48
 **/
public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("宝马雕车香满路。");
    }
}
