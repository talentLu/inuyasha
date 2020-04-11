package com.rudecrab.demo.common.designPattern.factory;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/11 18:04
 * @Version 1.0
 **/
public class CarFactory implements Factory{
    @Override
    public Car create(String car) {
        switch (car) {
            case "BMW":
                return new BMW();
            case "BAOMA":
                return new BAOMA();
            default:
        }
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

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.create("BMW");
        bmw.run();
        Car baoma = carFactory.createBAOMA();
        baoma.run();
        BaomaFactory factory = new BaomaFactory();
        Car baoma1 = factory.createBAOMA();
        baoma1.run();


    }
}
