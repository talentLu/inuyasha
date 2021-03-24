package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/3/24 10:32
 **/
public class Lk_9 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if (s.length()==1) {
            return true;
        }
        int start = 0;
        int len = s.length();
        int mid = len >> 1;
        while (start < mid) {
            char c = s.charAt(start);
            char c1 = s.charAt(len - start - 1);
            if (c != c1) {
                return false;
            }
            start++;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "1";
        System.out.println(s.length() >> 1);
    }
}
