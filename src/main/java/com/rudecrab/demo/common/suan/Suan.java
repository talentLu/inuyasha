package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/6/22 19:16
 **/
public class Suan {

    public static void main(String[] args) {
        String str = "this is a student";
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {

        }
    }

    public static String fanzhuan(String string) {
        char[] chars = string.toCharArray();
        int length = string.length();
        char a ;
        for (int i = 0; i < length; i++) {
            a = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = a;
        }
        return chars.toString();
    }
}
