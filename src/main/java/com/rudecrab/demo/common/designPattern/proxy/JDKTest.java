package com.rudecrab.demo.common.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/15 15:48
 **/
public class JDKTest {
    public static void main(String[] args) {
        Car car = new Car();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Moveable carProxy = (Moveable)Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(),
                new JDKTest().new CarProxy(car));
        //Object proxyClass = Proxy.getProxyClass(car.getClass().getClassLoader(), car.getClass().getInterfaces());
        //System.out.println(proxyClass.hashCode());
        System.out.println(carProxy.hashCode());
        carProxy.move();
    }

    class CarProxy implements InvocationHandler {
        Car car;

        public CarProxy(Car car) {
            this.car = car;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("东风夜放花千树。更吹落、星如雨");
            Object invoke = method.invoke(car, args);
            System.out.println("凤箫声动，玉壶光转，一夜鱼龙舞。");
            return invoke;
        }
    }
}
