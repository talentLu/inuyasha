package com.rudecrab.demo.common.designPattern.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/15 16:11
 **/
public class EnhanceTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(new Car().getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("东风夜放花千树。更吹落、星如雨");
                methodProxy.invokeSuper(o,objects);
                System.out.println("凤箫声动，玉壶光转，一夜鱼龙舞。");
                return null;
            }
        });
        Car car = (Car)enhancer.create();
        car.move();

    }
}
