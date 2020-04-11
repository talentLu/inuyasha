package com.rudecrab.demo.common.designPattern.factory;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/11 18:17
 * @Version 1.0
 **/
public class BaomaFactory implements Factory{
    @Override
    public Car create(String car) {
        return null;
    }

    @Override
    public Car createBMW() {
        return new BMW();
    }

    @Override
    public Car createBAOMA() {
        return new BAOMA();
    }
}
