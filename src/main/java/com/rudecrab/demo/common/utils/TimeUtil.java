package com.rudecrab.demo.common.utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/8/26 17:33
 **/
public class TimeUtil {
    public static void main(String[] args) {
        String time1 = "2021-08-11 06:57:48";
        StringBuilder time2 = new StringBuilder("2021-08-11 16:18");

        System.out.println(sub(time1, time2.append(":01").toString()));
    }
    public static long sub(String arg1,String arg2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time1 = LocalDateTime.parse(arg1, dateTimeFormatter);
        LocalDateTime time2 = LocalDateTime.parse(arg2, dateTimeFormatter);
        Duration between = Duration.between(time1, time2);
        return between.toMillis();

    }
}
