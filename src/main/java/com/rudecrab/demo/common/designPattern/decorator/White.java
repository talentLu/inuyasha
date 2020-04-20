package com.rudecrab.demo.common.designPattern.decorator;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/20 13:51
 **/
public class White implements Move {
    Move dog;

    public White(Move dog) {
        this.dog = dog;
    }

    @Override
    public void run() {
        System.out.println("他是白色的");
        dog.run();
    }

    public static void main(String[] args) {
        Move wdog = new White(new Dog());
        wdog.run();
    }
}
