package com.rudecrab.demo.common.io;

import java.io.*;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/17 16:35
 **/
public class ByteArrayOut {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car();
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bo);
        oos.writeObject(car);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bo.toByteArray()));
        Car o = (Car)ois.readObject();
        System.out.println(o.toString());
    }

}
