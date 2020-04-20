package com.rudecrab.demo.common.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/17 17:29
 **/

public class FileIO {
    public static void main(String[] args) {
        try {
            FileInputStream file1 = new FileInputStream("d:/121.txt");
            FileChannel channel = file1.getChannel();
            FileOutputStream file2 = new FileOutputStream("d:/12345.txt");
            FileChannel channel2 = file2.getChannel();
            // 下边开始声明一个字节缓冲器
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            /*while (channel.read(buffer) != -1) {//将物品从库存读入到缓冲器（大卡车）
                buffer.flip();
                channel2.write(buffer);//将缓冲器（大卡车）的物品，写出到目的地。
                buffer.clear();

            }*/
            channel.transferTo(0, channel.size(), channel2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
