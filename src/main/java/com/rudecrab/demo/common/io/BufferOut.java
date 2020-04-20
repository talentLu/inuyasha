package com.rudecrab.demo.common.io;

import java.io.*;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/17 16:35
 **/
public class BufferOut {
    public static void main(String[] args) throws IOException {
        //有个缓存区
        File file = new File("D:\\121.txt");
        //PipedOutputStream pos = new PipedOutputStream();
        //PipedInputStream pis = new PipedInputStream();
        //FileInputStream bi = new FileInputStream(file);
        FileInputStream fileInputStream = new FileInputStream("D:/121.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("D:/321.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        byte[] bytes = new byte[1024];
        int readLength;
        if ((readLength=bufferedInputStream.read(bytes)) > -1) {
            bufferedOutputStream.write(bytes);
        }
        bufferedOutputStream.flush();
        fileOutputStream.close();
        fileInputStream.close();
    }

}
