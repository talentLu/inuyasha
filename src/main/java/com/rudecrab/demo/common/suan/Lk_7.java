package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/3/24 11:00
 **/
public class Lk_7 {
    public static int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            //检查int溢出，-231 <= x <= 231 - 1
            if ((reverse * 10) / 10 != reverse) {
                reverse = 0;
                break;
            }
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(-103 % 10);
    }

}
