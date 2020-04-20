package com.rudecrab.demo.common.io;

import java.io.*;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/17 16:35
 **/
public class PipleOut {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //多用于多线程间通讯
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        pipedInputStream.connect(pipedOutputStream);
        pipedOutputStream.write(10);
        int read = pipedInputStream.read();
        System.out.println(read);

    }

}
