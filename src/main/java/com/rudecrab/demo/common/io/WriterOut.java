package com.rudecrab.demo.common.io;

import java.io.*;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/17 16:35
 **/
public class WriterOut {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader ois = new BufferedReader(new InputStreamReader(new FileInputStream("d:/121.txt")));
        BufferedWriter oos =
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("d:/12345.txt"))));
        byte[] bytes = new byte[1024];
        int i;
        if (ois.readLine()!=null) {
            oos.write(ois.readLine());
        }
    }

}
