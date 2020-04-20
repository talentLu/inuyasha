package com.rudecrab.demo.common.io;

import java.io.*;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/17 16:35
 **/
public class FileOut{
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\121.txt");
        //PipedOutputStream pos = new PipedOutputStream();
        //PipedInputStream pis = new PipedInputStream();
        //FileInputStream bi = new FileInputStream(file);
        FileInputStream fileInputStream = new FileInputStream("D:/121.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:/123.txt");
        byte[] bytes = new byte[1024];
        int readLength;
        if ((readLength=fileInputStream.read(bytes)) > -1) {
            fileOutputStream.write(bytes);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }

}
