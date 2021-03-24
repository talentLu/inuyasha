package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/3/24 15:49
 **/
public class Lk_14 {
    public static String longestCommonPrefix(String[] strs) {
        boolean flag = true;
        if (strs.length==0) {
            return "";
        }
        String pre = "";
        for (int i = 0; i <= 200 && flag; i++) {
            char temp = strs[0].charAt(0);
            for (int j = 0; j < strs.length && flag; j++) {
                char c;
                try {
                    c = strs[j].charAt(i);
                } catch (StringIndexOutOfBoundsException e) {
                    flag = false;
                    break;
                }
                if (j==0){ temp = c;}
                if (c != temp) {
                    flag = false;
                }
            }
            if (flag) {
                pre += temp;
            }
        }
        return pre;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs==null || strs.length==0) {
            return "";
        }
        String str = strs[0];
        for (String string : strs) {
            while (!string.startsWith(str)) {
                if (string.length() == 0) {
                    return "";
                }
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flowvwrwerewrwer","flower","flower"};
        System.out.println(longestCommonPrefix2(strs));

    }
}
