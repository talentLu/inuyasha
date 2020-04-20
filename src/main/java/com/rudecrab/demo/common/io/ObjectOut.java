package com.rudecrab.demo.common.io;

import java.io.*;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/17 16:35
 **/
public class ObjectOut {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:/121.txt")));
        oos.writeObject(car);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:/121.txt")));
        Car o = (Car)ois.readObject();
        System.out.println(o.toString());
    }

}
